import java.time.Instant
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.ZoneId
import java.time.temporal.WeekFields
import java.util.*

fun getWeeksSinceEpoch(): Long {
    // Get the current date and time
    val currentTimeMillis = System.currentTimeMillis()

    // Unix epoch (January 1, 1970)
    val epochMillis = 0L  // Unix epoch timestamp

    // Calculate the difference in milliseconds
    val diffMillis = currentTimeMillis - epochMillis

    // Convert milliseconds to weeks (1 week = 7 days = 7 * 24 * 60 * 60 * 1000 milliseconds)
    val millisInAWeek = 7 * 24 * 60 * 60 * 1000
    return diffMillis / millisInAWeek
}

fun main(){
/*    val currentTimestamp = System.currentTimeMillis() / 1000
    println(currentTimestamp)
    println(getCurrentWeekNumber())
    println(getCurrentWeekUnixTimestamp())
    println(getWeeksPassed(getCurrentWeekUnixTimestamp()))
    println(getWeeksPassedSinceEpoch())*/

    println(getWeeksSinceEpoch()+946)
}

fun getWeeksSinceSpecificDate(startDate: Calendar, currentDate: Calendar): Long {
    // Convert both dates to milliseconds
    val startMillis = startDate.timeInMillis
    val currentMillis = currentDate.timeInMillis

    // Calculate the difference in milliseconds
    val differenceMillis = currentMillis - startMillis

    // Convert milliseconds to days
    val differenceDays = differenceMillis / (1000 * 60 * 60 * 24)

    // Convert days to weeks
    return differenceDays / 7
}

fun getWeeksPassedSinceEpoch(): Long {
    // Get the current Unix timestamp (in seconds)
    val currentTimestamp = System.currentTimeMillis() / 1000  // Convert milliseconds to seconds

    // Number of seconds in a week (7 days * 24 hours * 60 minutes * 60 seconds)
    val secondsInAWeek = 7 * 24 * 60 * 60

    // Calculate the number of weeks passed since Unix epoch (1970-01-01)
    return currentTimestamp / secondsInAWeek
}


fun getWeeksPassed(startTimestamp: Long): Long {
    // Get the current Unix timestamp
    val currentTimestamp = System.currentTimeMillis() / 1000  // Convert milliseconds to seconds

    // Calculate the difference in seconds
    val secondsPassed = currentTimestamp - startTimestamp

    // Number of seconds in a week (7 days * 24 hours * 60 minutes * 60 seconds)
    val secondsInAWeek = 7 * 24 * 60 * 60

    // Calculate the number of weeks passed
    return secondsPassed / secondsInAWeek
}

fun getCurrentWeekUnixTimestamp(): Long {
    // Get the current date
    val calendar = Calendar.getInstance()

    // Set the calendar to the start of the current week (Monday)
    calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)

    // Get the Unix timestamp (in seconds) for the start of the current week
    return calendar.timeInMillis / 1000 // Convert milliseconds to seconds
}

fun getCurrentWeekNumber(): Long {
    // Get the current date
    val calendar = Calendar.getInstance()

    // Get the Unix timestamp for the start of the current week (Monday)
    calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)
    val weekStartTimestamp = calendar.timeInMillis / 1000 // Convert milliseconds to seconds

    // Get the current Unix timestamp
    val currentTimestamp = System.currentTimeMillis() / 1000 // Convert milliseconds to seconds

    // Calculate the number of seconds in a week (7 days * 24 hours * 60 minutes * 60 seconds)
    val secondsInAWeek = 7 * 24 * 60 * 60

    // Calculate the current week number
    val currentWeek = (currentTimestamp - weekStartTimestamp) / secondsInAWeek + 1

    return currentWeek
}