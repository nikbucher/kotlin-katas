import kotlin.test.Test
import kotlin.test.assertEquals

class TennisKataTest {
  @Test
  fun `check testcases`() {
    check(TennisScore("Any", 0, "Any", 0), "Love-All")
    check(TennisScore("Any", 1, "Any", 1), "Fifteen-All")
    check(TennisScore("Any", 2, "Any", 2), "Thirty-All")

    check(TennisScore("Any", 1, "Any", 0), "Fifteen-Love")
    check(TennisScore("Any", 0, "Any", 1), "Love-Fifteen")
    check(TennisScore("Any", 2, "Any", 0), "Thirty-Love")
    check(TennisScore("Any", 0, "Any", 2), "Love-Thirty")
    check(TennisScore("Any", 3, "Any", 0), "Forty-Love")
    check(TennisScore("Any", 0, "Any", 3), "Love-Forty")
    check(TennisScore("Any", 2, "Any", 1), "Thirty-Fifteen")
    check(TennisScore("Any", 1, "Any", 2), "Fifteen-Thirty")
    check(TennisScore("Any", 3, "Any", 1), "Forty-Fifteen")
    check(TennisScore("Any", 1, "Any", 3), "Fifteen-Forty")
    check(TennisScore("Any", 3, "Any", 2), "Forty-Thirty")
    check(TennisScore("Any", 2, "Any", 3), "Thirty-Forty")

    check(TennisScore("Any", 3, "Any", 3), "Deuce")
    check(TennisScore("Any", 4, "Any", 4), "Deuce")

    check(TennisScore("Sean", 4, "Nik", 3), "Advantage Sean")
    check(TennisScore("Sean", 3, "Nik", 4), "Advantage Nik")
    check(TennisScore("Sean", 5, "Nik", 4), "Advantage Sean")
    check(TennisScore("Sean", 4, "Nik", 5), "Advantage Nik")
    check(TennisScore("Sean", 15, "Nik", 14), "Advantage Sean")
    check(TennisScore("Sean", 14, "Nik", 15), "Advantage Nik")

    check(TennisScore("Sean", 4, "Nik", 0), "Win for Sean")
    check(TennisScore("Sean", 0, "Nik", 4), "Win for Nik")
    check(TennisScore("Sean", 4, "Nik", 1), "Win for Sean")
    check(TennisScore("Sean", 1, "Nik", 4), "Win for Nik")
    check(TennisScore("Sean", 4, "Nik", 2), "Win for Sean")
    check(TennisScore("Sean", 2, "Nik", 4), "Win for Nik")
    check(TennisScore("Sean", 6, "Nik", 4), "Win for Sean")
    check(TennisScore("Sean", 4, "Nik", 6), "Win for Nik")
    check(TennisScore("Sean", 16, "Nik", 14), "Win for Sean")
    check(TennisScore("Sean", 14, "Nik", 16), "Win for Nik")
  }

  fun check(tennisScore: TennisScore, result: String) {
    assertEquals(tennisScore.asString(), result)
  }
}
