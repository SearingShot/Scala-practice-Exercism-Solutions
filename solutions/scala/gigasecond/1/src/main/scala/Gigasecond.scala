import java.time.LocalDate
import java.time.LocalDateTime
import java.time._

object Gigasecond {
  val gigasecond = 1000000000
  def add(startDate: LocalDate): LocalDateTime = {
    var startSec = startDate.atStartOfDay(ZoneId.systemDefault()).toInstant.getEpochSecond
    startSec += gigasecond
    Instant.ofEpochSecond(startSec).atZone(ZoneId.systemDefault()).toLocalDateTime
    
  }

  def add(startDateTime: LocalDateTime): LocalDateTime = {
    var startSec = startDateTime.atZone(ZoneId.systemDefault()).toInstant.getEpochSecond
    startSec += gigasecond
    Instant.ofEpochSecond(startSec).atZone(ZoneId.systemDefault()).toLocalDateTime
  }
}
