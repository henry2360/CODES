package ChapterSeven;

import org.junit.jupiter.api.Test;

//import static Card.Faces.*;
//import static Card.Suits.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardTest {
    private static final Faces ACE = Faces.ACE;
    private static final Suits SPADE = Suits.SPADE;
    private static final Faces KING = Faces.KING;
    private static final Suits HEARTS =Suits.HEARTS ;
    private static final Faces TWO = Faces.TWO;
    private static final Suits CLUB =Suits.CLUB ;
    private static final Faces JACK = Faces.JACK;
    private static final Suits DIAMOND = Suits.DIAMOND;
    private static final Faces QUEEN =Faces.QUEEN ;
    private static final Faces SIX = Faces.SIX;
    private static final Faces SEVEN =Faces.SEVEN ;
    private static final Faces THREE = Faces.THREE;
    private static final Faces FOUR = Faces.FOUR;
    private static final Faces FIVE =Faces.FIVE ;
    private static final Faces EIGHT =Faces.EIGHT ;
    private static final Faces NINE =Faces.NINE ;
    private static final Faces TEN = Faces.TEN;


    @Test
        void testThatSpadeCardCanBeCreated(){
            Card card = new Card(ACE, SPADE);
            assertEquals(card.getSuit(), SPADE);
        }
        @Test
        void testThatDiamondCardCanBeCreated(){
            Card card = new Card(ACE, DIAMOND);
            assertEquals(card.getSuit(), DIAMOND);
        }
        @Test
        void testThatClubCardCanBeCreated(){
            Card card = new Card(ACE, CLUB);
            assertEquals(card.getSuit(), CLUB);
        }
        @Test
        void testThatHeartsCardCanBeCreated(){
            Card card = new Card(ACE, HEARTS);
            assertEquals(card.getSuit(), HEARTS);
        }
        @Test
        void testThatAceCardCanBeCreated(){
            Card card = new Card(ACE, SPADE);
            assertEquals(card.getFace(), ACE);
        }
        @Test
        void testThatCardTwoCanBeCreated(){
            Card card = new Card(TWO, SPADE);
            assertEquals(card.getFace(), TWO);
        }
        @Test
        void testThatCardThreeCanBeCreated(){
            Card card = new Card(THREE, SPADE);
            assertEquals(card.getFace(), THREE);
        }
        @Test
        void testThatCardFourCanBeCreated(){
            Card card = new Card(FOUR, SPADE);
            assertEquals(card.getFace(), FOUR);
        }
        @Test
        void testThatCardFiveCanBeCreated(){
            Card card = new Card(FIVE, SPADE);
            assertEquals(card.getFace(), FIVE);
        }
        @Test
        void testThatCardSixCanBeCreated(){
            Card card = new Card(SIX, SPADE);
            assertEquals(card.getFace(), SIX);
        }
        @Test
        void testThatCardSevenCanBeCreated(){
            Card card = new Card(SEVEN, SPADE);
            assertEquals(card.getFace(), SEVEN);
        }
        @Test
        void testThatCardEightCanBeCreated(){
            Card card = new Card(EIGHT, SPADE);
            assertEquals(card.getFace(), EIGHT);
        }
        @Test
        void testThatCardNineCanBeCreated(){
            Card card = new Card(NINE, SPADE);
            assertEquals(card.getFace(), NINE);
        }
        @Test
        void testThatCardTenCanBeCreated(){
            Card card = new Card(TEN, SPADE);
            assertEquals(card.getFace(), TEN);
        }
        @Test
        void testThatJackCardCanBeCreated(){
            Card card = new Card(JACK, SPADE);
            assertEquals(card.getFace(), JACK);
        }
        @Test
        void testThatKingCardCanBeCreated(){
            Card card = new Card(KING, SPADE);
            assertEquals(card.getFace(), KING);
        }
        @Test
        void testThatQueenCardCanBeCreated(){
            Card card = new Card(QUEEN, SPADE);
            assertEquals(card.getFace(), QUEEN);
        }
        @Test
        void testThatCardHasFaceAndSuit(){
            Card card = new Card(QUEEN, SPADE);
            assertEquals("QUEEN of SPADE", card.toString());
        }
        @Test
        void testThatTwoCardsWithMatchingSuitsAreEqual(){
            Card card = new Card(QUEEN, SPADE);
            assertEquals(SPADE, card.getSuit());
            Card secondCard = new Card(JACK, SPADE);
            assertEquals(SPADE, secondCard.getSuit());
            assertEquals(card, secondCard);
        }
        @Test
        void testThatTwoCardsWithMatchingFacesAreEqual(){
            Card card = new Card(QUEEN, CLUB);
            assertEquals(QUEEN, card.getFace());
            Card secondCard = new Card(QUEEN, SPADE);
            assertEquals(QUEEN, secondCard.getFace());
            assertEquals(card, secondCard);
        }



    }

