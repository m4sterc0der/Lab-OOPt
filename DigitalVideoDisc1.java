public class DigitalVideoDisc1 {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public boolean equals(DigitalVideoDisc1 a) {
        return (this.title == a.title && this.category == a.category && this.director == a.director && this.length == a.length && this.cost == a.cost);
    }

    public void displayDVD() {
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Cost: " + cost);
        System.out.println("Director: " + director);
        System.out.println("Length: " + length);
    }
    public DigitalVideoDisc1 (String title) {
        this.title = title;
    }

    public DigitalVideoDisc1 (String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public DigitalVideoDisc1 (String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
    }
    public String getTitle() {
        return this.title;
    }
    public String getCategory() {
        return this.category;
    }
    public String getDirector() {
        return this.director;
    }
    public int getLength() {
        return this.length;
    }
    public float getCost() {
        return this.cost;
    }
}
