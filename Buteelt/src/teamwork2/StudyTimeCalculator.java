package teamwork2;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class StudyTimeCalculator {
    public static void main(String[] args) {
        // Суралцах хугацааг тодорхойлох
        StudyPeriod period1 = new StudyPeriod(
            LocalDate.of(1978, 9, 1), // Эхний хугацааны эхлэх 
            LocalDate.of(1988, 9, 1), // Эхний хугацааны дуусах 
            10, // Дунд сургуульд суралцсан жил
            5 // Их сургуульд суралцсан жил
        );

        StudyPeriod period2 = new StudyPeriod(
            LocalDate.of(2006, 9, 1), // 2-дахь хугацааны эхлэх
            LocalDate.of(2018, 9, 1), // 2-дахь хугацааны дуусах
            12, // Дунд сургуульд суралцсан жил
            4 // Их сургуульд суралцсан жил
        );

        // Суралцсан цаг олох
        long period1TotalStudyTime = period1.calculateTotalStudyTime();
        long period2TotalStudyTime = period2.calculateTotalStudyTime();
        
        System.out.println(period1TotalStudyTime);
        System.out.println(period2TotalStudyTime);
        // 2 хугацаагаа харьцуулах
        if (period1TotalStudyTime > period2TotalStudyTime) {
            System.out.println("1978 их цаг суралцсан.");
        } else if (period1TotalStudyTime < period2TotalStudyTime) {
            System.out.println("2006 их цаг суралцсан.");
        } else {
            System.out.println("Адилхан цаг суралцсан.");
        }

        int period1InterestHours = period1.calculateInterestHours();
        int period2InterestHours = period2.calculateInterestHours();

        System.out.println("Дуртай хичээлдээ өнгөрүүлсэн цаг:");
        System.out.println("Эхний хугацаа: " + period1InterestHours + " hours");
        System.out.println("2-дахь хугацаа: " + period2InterestHours + " hours");

        // Дадлага
        double internshipPercentage = period2.calculateInternshipPercentage();
        System.out.printf("Дадлагын цагийн суралцах хугацаанд нь эзлэх хувь: %.2f%%", internshipPercentage);
    }

    static class StudyPeriod {
        LocalDate startDate;
        LocalDate endDate;
        int yearsInSchool;
        int yearsInUniversity;

        StudyPeriod(LocalDate startDate, LocalDate endDate, int yearsInSchool, int yearsInUniversity) {
            this.startDate = startDate;
            this.endDate = endDate;
            this.yearsInSchool = yearsInSchool;
            this.yearsInUniversity = yearsInUniversity;
        }

        // Хугацааны туршид нийт суралцсан цаг
        long calculateTotalStudyTime() {
            LocalDate currentDate = startDate;
            long totalStudyTime = 0;

            // Жил болгоноор олох
            for (int i = 0; i < yearsInSchool + yearsInUniversity; i++) {
                totalStudyTime += calculateStudyTimeForYear(currentDate.getYear());
                currentDate = currentDate.plusYears(1);
            }

            return totalStudyTime;
        }

        long calculateStudyTimeForYear(int year) {
            int totalDays = LocalDate.of(year, 9, 1).until(LocalDate.of(year + 1, 6, 1)).getDays() + 1;

            // Aмралтын өдөр баяр тооцохгүй
            return totalDays * (5 * 8 + 6 * 6); 
        }


        int calculateInterestHours() {
            int totalInterestHours = 0;

            
            for (int year = startDate.getYear(); year < startDate.getYear() + yearsInSchool; year++) {
                LocalDate startOfYear = LocalDate.of(year, 9, 1);
                LocalDate endOfYear = LocalDate.of(year + 1, 6, 1);

                while (startOfYear.isBefore(endOfYear)) {
                    if (startOfYear.getDayOfWeek().getValue() <= 5) { 
                        totalInterestHours += 4;
                    }
                    startOfYear = startOfYear.plusDays(1);
                }
            }

            return totalInterestHours;
        }

        // Дадлага
        double calculateInternshipPercentage() {
            int totalWeeksInUniversity = yearsInUniversity * 40; // Жилд 40 7 хоног
            int totalInternshipWeeks = yearsInUniversity * 8;
            return ((double) totalInternshipWeeks / totalWeeksInUniversity) * 100;
        }
    }
}