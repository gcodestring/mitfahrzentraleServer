/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.mfz.mitfahrzentrale;

import com.sun.grizzly.http.SelectorThread;
import com.sun.jersey.api.container.grizzly.GrizzlyServerFactory;

public class MitfahrzentraleServer
{
   public static void main( String[] args ) throws Exception
   {
      String url = ( args.length > 0 ) ? args[0] : "http://localhost:4434";
      String min = ( args.length > 1 ) ? args[1] : "10";

      SelectorThread srv = GrizzlyServerFactory.create( url );

      System.out.println( "URL: " + url );
      Thread.sleep( 1000 * 60 * Integer.parseInt(min));
      srv.stopEndpoint();
   }
}