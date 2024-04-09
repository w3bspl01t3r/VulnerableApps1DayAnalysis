package io.dropwizard.archetypes.resources;


import io.dropwizard.validation.selfvalidating.SelfValidating;
import io.dropwizard.validation.selfvalidating.SelfValidation;
import io.dropwizard.validation.selfvalidating.ViolationCollector;

@SelfValidating
public class Employee {

    public Employee(String job, String name) {
        this.job = job;
        this.name = name;
    }
public Employee()
{}
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    @SelfValidation
    public void validate(ViolationCollector col)
    {
        if(!this.name.equalsIgnoreCase("Swagat"))
        {
            col.addViolation("Not a valid Employee "+this.name);
        }
    }

}
