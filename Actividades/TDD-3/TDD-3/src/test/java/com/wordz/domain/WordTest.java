package com.wordz.domain;

import static com.wordz.domain.Letter.CORRECT;
import static com.wordz.domain.Letter.INCORRECT;
import static com.wordz.domain.Letter.PART_CORRECT;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class WordTest {

  @Test
  public void oneIncorrectLetter() {
    var word = new Word("A");
    var score = word.guess("Z");
    assertScoreForGuess(score, INCORRECT);
  }

  @Test
  public void oneCorrectLetter() {
    var word = new Word("A");
    var score = word.guess("A");
    assertScoreForGuess(score, CORRECT);
  }

  @Test
  void secondLetterWrongPosition() {
    var word = new Word("AR");
    var score = word.guess("ZA");
    assertScoreForGuess(score, INCORRECT, PART_CORRECT);
  }

  @Test
  void allScoreCombinations() {
    var word = new Word("ARI");
    var score = word.guess("ZAI");
    assertScoreForGuess(score, INCORRECT, PART_CORRECT, CORRECT);
  }

  private void assertScoreForGuess(Score score, Letter... expectedScores) {
    for (int position = 0; position < expectedScores.length; position++) {
      Letter expected = expectedScores[position];
      assertThat(score.letter(position)).isEqualTo(expected);
    }
  }
}
