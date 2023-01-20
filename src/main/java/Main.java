import com.jdbc.homework4.feature.database.DatabasePopulateService;
import com.jdbc.homework4.feature.database.DatabaseQueryService;
import com.jdbc.homework4.feature.deserialization.Worker;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        new DatabasePopulateService().populate();
        List<Worker> workers = new DatabaseQueryService().findYoungestAndEldestWorker();
        for (Worker w:workers) {
            System.out.println(w.toString());
        }

    }
}
