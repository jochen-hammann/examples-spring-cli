package com.example.spring.commandlineinterface.cli;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CliApplication implements ApplicationRunner
{
    public static void main(String[] args)
    {
        // Hint: Without close(), the CLI application will not exit after run() is finished.
        SpringApplication.run(CliApplication.class, args).close();
    }

    @Override
    public void run(ApplicationArguments args) throws Exception
    {
        System.out.println("Hello, world!");
    }
}
