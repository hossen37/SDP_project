
package blood_management_system_final;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Controller {
    private Search view;
    

    public Controller(Search view) {
        this.view = view;
    }

    public void filterTable(String query) {
        DefaultTableModel model = (DefaultTableModel) view.getJTable().getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        view.getJTable().setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(query));
    }
}
