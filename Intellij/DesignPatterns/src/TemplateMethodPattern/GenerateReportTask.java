package TemplateMethodPattern;

public class GenerateReportTask extends Task {
    private AuditTrail auditTrail;
    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
        System.out.println("Generated REPORT");
    }
    @Override
    public void doExecute() {

    }


}
