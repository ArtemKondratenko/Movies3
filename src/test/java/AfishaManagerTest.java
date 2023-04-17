import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    Movies film1= new Movies("Рембо");
    Movies film2= new Movies("На игле");
    Movies film3= new Movies("Терминатор");
    Movies film4= new Movies("ЧБД");



    @Test
    public  void test() {
        AfishaManager repo = new AfishaManager();
        repo.add(film1);
        repo.add(film2);
        repo.add(film3);
        repo.add(film4);

        Movies[] expected = {film1,film2,film3,film4};
        Movies[] actual = repo.getMovies();

        Assertions.assertArrayEquals(expected,actual);

    }
    @Test
    public void printMovies() {
        AfishaManager repo = new AfishaManager();
        repo.findAll();
    }
    @Test
    public void printRevMov() {
        AfishaManager repo = new AfishaManager(3);
        repo.findLast(3);
    }

}
