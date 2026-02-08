package DataExportFeature;

public class SalesReportExporter implements ReportExporter{
	public void exportToCSV() {
        System.out.println("Sales report exported to CSV");
    }

    public void exportToPDF() {
        System.out.println("Sales report exported to PDF");
    }
}
