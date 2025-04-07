public class BookProba {

    public String title;
    private int releaseYear;
    private String author;
    public int pages;


    public BookProba(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;

    }

    public String getTitle() {
        return title;
    }

    public int getReleasYear() {
        return releaseYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int year) {
        this.releaseYear = releaseYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return "Книга: " + title + "\n" + "Год издания: " + releaseYear + "\n" + "Автор: " + author + "\n" + "Количество страниц: " + pages;
    }


    int estimatePrice(int pages) {
        int prise;
        prise = pages * 3;
        if (prise <= 250) {
            return 250;
        } else {
            return prise;
        }

    }


}

















