package TemplateMethodPattern;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task(){
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    void execute() {
        auditTrail.record();
        doExecute();
    }
    //Primitive Implementations that need to be overridden, and I hate inheritance...
    protected abstract void doExecute();
}
