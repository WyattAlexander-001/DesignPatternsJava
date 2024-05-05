package CommandPattern.fx;

import CommandPattern.AppExampleCustomerService;

public class AddCustomerCommand implements Command {
    private AppExampleCustomerService service;
    public AddCustomerCommand(AppExampleCustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer(); //delegating work to this service

    }
}
