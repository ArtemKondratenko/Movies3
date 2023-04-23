public class AfishaManager {
    
    private int maxNumberMovies = 10;
    private Movie[] items;
    private int count = 0;

    public AfishaManager() {
        items = new Movie[maxNumberMovies];
    }
    public AfishaManager(int limitNumberMovies) {
        this.maxNumberMovies = limitNumberMovies;
        items = new Movie[maxNumberMovies];
    }

    public void add(Movie film) {
        if(count == maxNumberMovies) {
            count = 0;
        }
        items[count] = film;
        count++;
    }
    public Movie[] getMovies() {
        return items;
    }

    public Movie[] findLast() {
        int count = 0;
        for(Movie film : items) {
            if(film != null) {
                count++;
            }
        }

        Movie[] revMovies = new Movie[count];
        int index = 0;
        for(int i = items.length-1; i >= 0; i--) {
            if(items[i] != null) {
                revMovies[index] = items[i];
                System.out.println(revMovies[index].getname());
                index++;
            }
        }
        return  revMovies;
    }

    public void findAll() {
        for (Movie f: items) {
            System.out.println(f.getname());
        }
    }


}
