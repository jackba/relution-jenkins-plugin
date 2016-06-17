
package org.jenkinsci.plugins.relution_publisher.builder;

import org.jenkinsci.plugins.relution_publisher.configuration.jobs.Publication;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;

import hudson.model.Result;


public interface Uploader {

    Result publish(File basePath, Publication publication) throws URISyntaxException, InterruptedException, IOException, ExecutionException;
}
