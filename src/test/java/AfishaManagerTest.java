import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    Movie film1= new Movie("Рембо");
    Movie film2= new Movie("На игле");
    Movie film3= new Movie("Терминатор");
    Movie film4= new Movie("ЧБД");



    @Test
    public  void test() {
        AfishaManager repo = new AfishaManager(4);
        repo.add(film1);
        repo.add(film2);
        repo.add(film3);
        repo.add(film4);

        Movie[] expected = {film1,film2,film3,film4};
        Movie[] actual = repo.getMovies();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void printMovies() {
        AfishaManager repo = new AfishaManager(4);
        repo.add(film1);
        repo.add(film2);
        repo.add(film3);
        repo.add(film4);
        repo.findAll();
    }

    @Test
    public void printRevMov() {
        AfishaManager repo = new AfishaManager(10);
        repo.add(film1);
        repo.add(film2);
        repo.add(film3);
        Movie[] rever =  repo.findLast();
        Movie[] moies = {film3,film2,film1};
        Assertions.assertArrayEquals(moies,rever);
    }

}
