package ChapterSeven;
import org.junit.jupiter.api.Test;

//import static Card.Faces.*;
//import static Card.Suits.*;
import static org.junit.jupiter.api.Assertions.*;


public class PlayerTest {

    private static final Faces JACK =Faces.JACK ;
    private static final Suits CLUB =Suits.CLUB ;
    private static final Suits HEARTS = Suits.HEARTS;
    private static final Faces SEVEN =Faces.SEVEN ;

    @Test
    void testThatPlayerHasACard(){
        Player player = new Player("Joe");
        assertEquals("Joe", player.getName());
        Card card = new Card(JACK, CLUB);
        player.addCard(card);
        assertEquals(1, player.getNumberOfCards());
    }

    @Test
    void testThatPlayerCanPlayCardToMatchingFace(){
        Player player = new Player("Joe");
        DeckOfCards deck = new DeckOfCards(3);
        Card card = new Card(JACK, CLUB);
        Card deckCard = new Card(JACK, HEARTS);
        deck.push(deckCard);
        player.addCard(card);
        assertEquals(1, player.getNumberOfCards());
        assertEquals(1, deck.getNumberOfCardsInDeck());

        player.playCard(1, deck);
        assertEquals(0, player.getNumberOfCards());
        assertSame(card, deck.peek());
        assertEquals(2, deck.getNumberOfCardsInDeck());
    }

    @Test
    void testThatPlayerCanPlayCardToMatchingSuit(){
        Player player = new Player("Joe");
        DeckOfCards deck = new DeckOfCards(3);
        Card card = new Card(JACK, CLUB);
        Card deckCard = new Card(SEVEN, CLUB);
        deck.push(deckCard);
        player.addCard(card);
        assertEquals(1, player.getNumberOfCards());
        assertEquals(1, deck.getNumberOfCardsInDeck());

        player.playCard(1, deck);
        assertEquals(0, player.getNumberOfCards());
        assertSame(card, deck.peek());
        assertEquals(2, deck.getNumberOfCardsInDeck());
    }

    @Test
    void testThatCardPlayedToNonMatchingFaceOrSuitThrowsInvalidCardException(){
        Player player = new Player("Joe");
        DeckOfCards deck = new DeckOfCards(3);
        Card card = new Card(JACK, CLUB);
        Card deckCard = new Card(SEVEN, HEARTS);
        deck.push(deckCard);
        player.addCard(card);
        assertEquals(1, player.getNumberOfCards());
        assertEquals(1, deck.getNumberOfCardsInDeck());

        assertThrows(InvalidCardException.class, ()-> player.playCard(1, deck));
    }

    @Test
    void testThatWhenPlayerWithNoCardsPlayCard_throwsStackUnderFlowException(){
        Player player = new Player("Joe");
        DeckOfCards deck = new DeckOfCards(3);
        assertEquals(0, player.getNumberOfCards());
        assertTrue(player.hasNoCard());

        assertThrows(StackUnderflowException.class, ()-> player.playCard(1, deck));
    }

}