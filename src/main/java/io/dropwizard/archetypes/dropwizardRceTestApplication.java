package io.dropwizard.archetypes;

import io.dropwizard.Application;
import io.dropwizard.archetypes.resources.RceController;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class dropwizardRceTestApplication extends Application<dropwizardRceTestConfiguration> {

    public static void main(final String[] args) throws Exception {
        new dropwizardRceTestApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizardRceTest";
    }

    @Override
    public void initialize(final Bootstrap<dropwizardRceTestConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final dropwizardRceTestConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        environment.jersey().register(new RceController());
    }

}
