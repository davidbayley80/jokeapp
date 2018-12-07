package guru.springframework.joke.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImp implements JokeService {

    /* declaring a variable that cannot be changed */
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImp() {
        /* initaties a variable */
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        /*chuckNorrisQuotes = .Java file
        * .getRandomQuote = function within the class*/
        return chuckNorrisQuotes.getRandomQuote();
    }
}
