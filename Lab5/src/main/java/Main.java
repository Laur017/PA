import javax.xml.catalog.CatalogFeatures;
import java.io.IOException;
import java.nio.file.Paths;
public class Main {
    public static void main(String args[]) {
        Main app = new Main();

            app.createSave();
            app.loadView();
    }

    private void createSave() {
        Catalog catalog = new Catalog("Bibliografie");
        var book = new Book("article1", "RH_StudyGuide", "src/main/java/RH_StudyGuide.pdf", "1999","Someone1" );
        var article = new Article("book1", "The Gifts of Imperfection", "src/main/java/The Gifts of Imperfection.pdf", "2000", "Someone2");
        catalog.add(book);
        catalog.add(article);

        try {
            CatalogUtil.save(catalog, "catalog.txt");
        } catch (IOException exception) {
            System.out.println(exception);
        }}

        private void loadView() {
            try {
                Catalog catalog = CatalogUtil.load("Catalog.txt");
            } catch (InvalidCatalogException exception) {
                System.out.println(exception);
            }
        }


    }
