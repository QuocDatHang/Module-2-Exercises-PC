import com.sun.xml.internal.bind.v2.schemagen.xmlschema.NestedParticle;

import java.util.ArrayList;
import java.util.List;

public class DocumentManagement {
    List<Document> documentList;
     public DocumentManagement(){
        this.documentList = new ArrayList<>();
    }
    public void addDocument(Document document){
         this.documentList.add(document);
    }
    public boolean deleteDocument(String id){
        Document doc = this.documentList.stream().filter(document -> document.getId().equals(id)).findFirst().orElse(null);
        if (doc == null) return false;
        this.documentList.remove(doc);
        return true;
     }
    public void showInfo(){
//        System.out.printf("%10s | %10s | %10s | %10s | %10s \n", "id", "publisher", "releaseNumber", "authorName", "numberPaper");
        this.documentList.forEach(System.out::println);
//        this.documentList.forEach(document -> {
//
//        });
    }
    public void searchByBook(){
         this.documentList.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
    }
    public void searchByJournal(){
        this.documentList.stream().filter(doc -> doc instanceof Journal).forEach(doc -> System.out.println(doc.toString()));
    }
    public void searchByNewspaper(){
        this.documentList.stream().filter(doc -> doc instanceof Newspaper).forEach(doc -> System.out.println(doc.toString()));
    }
}
