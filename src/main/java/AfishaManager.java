public class AfishaManager {
    
    private int maxNumberMovies = 10;
    private Movies[] items = new Movies[0];

    public AfishaManager() {}
    public AfishaManager(int limitNumberMovies) {
        this.maxNumberMovies = limitNumberMovies;
    }

    public void add(Movies film) {
        Movies[] addMovies = new Movies[items.length + 1];
        for(int i = 0; i < items.length; i++) {
            addMovies[i] = items[i];
        }
        addMovies[addMovies.length -1] = film;
        items = addMovies;
    }
    public Movies[] getMovies() {
        return items;
    }

    public void findLast(int maxNumberMovies) {
        String[] revMovies = new String[maxNumberMovies];
        int index = 0;
        for(int i = items.length-1; i > 0; i--) {
            revMovies[index] = String.valueOf(items[i]);
            index++;
        }
        System.out.println(revMovies);
    }

    public void findAll() {
        for (Movies f: items) {
            System.out.println(f);
        }
    }


}
