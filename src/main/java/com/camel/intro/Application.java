package com.camel.intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.applet.Applet;
import java.beans.AppletInitializer;
import java.beans.beancontext.BeanContext;

@SpringBootApplication
public class Application implements AppletInitializer {

   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }

   @Override
   public void initialize(Applet newAppletBean, BeanContext bCtxt) {

   }

   @Override
   public void activate(Applet newApplet) {

   }
}
