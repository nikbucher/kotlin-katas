val scoreByPoints = listOf("Love", "Fifteen", "Thirty", "Forty")

typealias Points = Int

fun scoreOf(points: Int): String = scoreByPoints[points]

class TennisScore(
        private val player1: String, private val pointsPlayer1: Points,
        private val player2: String, private val pointsPlayer2: Points
) {

  val equalScores
    get() = pointsPlayer1 == pointsPlayer2
  val all
    get() = equalScores && pointsPlayer1 < 3
  val deuce
    get() = equalScores && pointsPlayer1 >= 3
  val advantagePlayer1
    get() = pointsPlayer1 advantageTo pointsPlayer2
  val advantagePlayer2
    get() = pointsPlayer2 advantageTo pointsPlayer1
  val player1Won
    get() = pointsPlayer1 wonTo pointsPlayer2
  val player2Won
    get() = pointsPlayer2 wonTo pointsPlayer1

  infix fun Points.advantageTo(otherPoints: Points) =
          this >= 4 && this - otherPoints == 1

  infix fun Points.wonTo(otherPoints: Points) =
          this >= 4 && this - otherPoints >= 2

  fun asString() =
          when {
            all -> "${scoreOf(pointsPlayer1)}-All"
            deuce -> "Deuce"
            advantagePlayer1 -> "Advantage $player1"
            advantagePlayer2 -> "Advantage $player2"
            player1Won -> "Win for $player1"
            player2Won -> "Win for $player2"
            else -> "${scoreOf(pointsPlayer1)}-${scoreOf(pointsPlayer2)}"
          }
}
