package DataExportFeature;

public class ReportApp {

	public static void main(String[] args) {
		ReportExporter r1 = new SalesReportExporter();

        r1.exportToCSV();
        r1.exportToPDF();
        r1.exportToJSON();

	}

}
