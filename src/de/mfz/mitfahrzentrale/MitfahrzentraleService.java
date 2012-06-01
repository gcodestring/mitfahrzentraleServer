package de.mfz.mitfahrzentrale;

import de.mfz.jaxb.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.ws.rs.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * Resourcenklasse für die Mitfahrzentrale.
 * @author Sascha Lemke, Guido Schori, René Zwinge
 */
@Path( "/mitfahrzentrale" )
public class MitfahrzentraleService
{
    private ObjectFactory ob = new ObjectFactory();
    private JAXBContext context;
    private Mitfahrzentrale mfz;
    private final String INPUTFILE = "C:/Users/netro/Documents/NetBeansProjects/Server/src/mfz.xml";
    private final String OUTPUTFILE = "C:/Users/netro/Documents/NetBeansProjects/Server/src/mfz.xml";
    
   /**
    * Gibt alle Daten der XML Datei aus.
    * @return Alle Daten der XML Datei.
    * @throws JAXBException
    * @throws FileNotFoundException 
    */
   @GET 
   @Produces("application/xml")
   public Mitfahrzentrale getAll() throws JAXBException, FileNotFoundException {
       unmarshal(INPUTFILE);
       return mfz;
   }
   
   /**
    * Gibt Alle Fahrten zurück.
    * @return Alle Fahrten der Mitfahrzentrale.
    * @throws JAXBException
    * @throws FileNotFoundException 
    */
   @GET
   @Path("fahrten/")
   @Produces("application/xml")
   public Mitfahrzentrale getFahrten() throws JAXBException, FileNotFoundException {
       unmarshal(INPUTFILE);
       
       Mitfahrzentrale rt = ob.createMitfahrzentrale();
       rt.getFahrten().addAll(mfz.getFahrten());
       return rt;
   }
   
   
   /**
    * Gibt eine bestimmte Fahrt aus.
    * @param i Die Fahrtid
    * @return Die gewählte Fahrt anhand der Fahrtid.
    * @throws JAXBException
    * @throws FileNotFoundException 
    */
   @GET
   @Path("fahrten/{mfzid}")
   @Produces("application/xml")
   public Mitfahrzentrale getFahrt(@PathParam("mfzid") int i) throws JAXBException, FileNotFoundException {
       unmarshal(INPUTFILE);
       
       Mitfahrzentrale rt = ob.createMitfahrzentrale();
       rt.getFahrten().add(mfz.getFahrten().get(i-1));
       return rt;
   }
   
   /**
    * Gibt alle User der Mitfahrzentrale zurück.
    * @return Die User der Mitfahrzentrale.
    * @throws JAXBException
    * @throws FileNotFoundException 
    */
   @GET
   @Path("user")
   @Produces("application/xml")
   public Mitfahrzentrale getUser() throws JAXBException, FileNotFoundException {
       unmarshal(INPUTFILE);
       
       Mitfahrzentrale rt = ob.createMitfahrzentrale();
       rt.setUsers(new Users());
       rt.getUsers().getPerson().addAll(mfz.getUsers().getPerson());
       return rt;
   }
   
   
   /**
    * Gibt einen bestimmten User zurück.
    * @param i Die Userid
    * @return Der gewählte User anhand der Userid.
    * @throws JAXBException
    * @throws FileNotFoundException 
    */
   @GET
   @Path("user/{userid}")
   @Produces("application/xml")
   public Mitfahrzentrale getUser(@PathParam("userid") int i) throws JAXBException, FileNotFoundException {
       unmarshal(INPUTFILE);
       
       Mitfahrzentrale rt = ob.createMitfahrzentrale();
       rt.setUsers(new Users());
       rt.getUsers().getPerson().add(mfz.getUsers().getPerson().get(i-1));
       return rt;
   }
   
   /**
    * Erstellt einen User in der XML Datei.
    * @param p Der User
    * @throws JAXBException
    * @throws FileNotFoundException
    * @throws IOException 
    */
   @POST
   @Path("user/create")
   public void createuser(Person p) throws JAXBException, FileNotFoundException, IOException {
       unmarshal(INPUTFILE);
       
       Marshaller m = context.createMarshaller();
       m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
       mfz.getUsers().getPerson().add(p);
       m.marshal(mfz, new FileWriter(OUTPUTFILE));
   }
   
   /**
    * Bearbeitet einen bestimmten User in der XML-Datei.
    * @param userID Die Nummer des zu bearbeitenden Users.
    * @param p Die neuen Userdaten.
    * @throws JAXBException
    * @throws FileNotFoundException
    * @throws IOException 
    */
   @PUT
   @Path("user/edit/{userid}")
   public void editUser(@PathParam("userid") int userID, Person p) throws JAXBException, FileNotFoundException, IOException {
       unmarshal(INPUTFILE);
       
       Marshaller m = context.createMarshaller();
       m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
       System.out.println(p.getName());
       mfz.getUsers().getPerson().get(userID).setEmail(p.getEmail());
       mfz.getUsers().getPerson().get(userID).setName(p.getName());
       mfz.getUsers().getPerson().get(userID).setPassword(p.getPassword());
       mfz.getUsers().getPerson().get(userID).setHasRoute(p.isHasRoute());
       m.marshal(mfz, new FileWriter(OUTPUTFILE));
   }
  
   /**
    * Löscht einen User aus der XML Datei.
    * @param userID Die Nummer des Users.
    * @throws JAXBException
    * @throws FileNotFoundException
    * @throws IOException 
    */
   @DELETE
   @Path("user/delete/{userid}")
   public void deleteUser(@PathParam("userid") int userID) throws JAXBException, FileNotFoundException, IOException {
       unmarshal(INPUTFILE);
       System.out.println(userID);
       Marshaller m = context.createMarshaller();
       m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
       mfz.getUsers().getPerson().remove(userID);
       m.marshal(mfz, new FileWriter(OUTPUTFILE));
   }
   
   /**
    * Erstellt eine Fahrt in der XML-Datei.
    * @param f Die Fahrt die gespeichert wird.
    * @throws JAXBException
    * @throws FileNotFoundException
    * @throws IOException 
    */
   @POST
   @Path("fahrten/create")
   public void createFahrt(Fahrten f) throws JAXBException, FileNotFoundException, IOException {
       unmarshal(INPUTFILE);
       
       System.out.println(f);
       
       Marshaller m = context.createMarshaller();
       m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
       mfz.getFahrten().add(f);
       m.marshal(mfz, new FileWriter(OUTPUTFILE));
   }
   
   /**
    * Bearbeitet eine Fahrt in der XML-Datei.
    * @param fahrtID Die Nummer der zu bearbeitenden Fahrt.
    * @param f Die neuen Fahrtdaten.
    * @throws JAXBException
    * @throws FileNotFoundException
    * @throws IOException 
    */
   @PUT
   @Path("fahrten/edit/{fahrtenid}")
   public void editFahrt(@PathParam("fahrtenid") int fahrtID, Fahrten f) throws JAXBException, FileNotFoundException, IOException {
       unmarshal(INPUTFILE);
       
       Marshaller m = context.createMarshaller();
       m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
       
       if(f.getContact() != null) {
            if(!mfz.getFahrten().get(fahrtID-1).getContact().equals(f.getContact())) {
                    mfz.getFahrten().get(fahrtID-1).setContact(f.getContact());
            }   
       }
       
       if(f.getFahrer() != null) {
            if(!mfz.getFahrten().get(fahrtID-1).getFahrer().equals(f.getFahrer())) {
                    mfz.getFahrten().get(fahrtID-1).setFahrer(f.getFahrer());
            }
       }
       
       if(f.getMitfahrer() != null) {
           if(mfz.getFahrten().get(fahrtID-1).getMitfahrer() != null) {
                for(Person p : f.getMitfahrer().getPerson()) {
                    mfz.getFahrten().get(fahrtID-1).getMitfahrer().getPerson().add(p);
                }
                
           } else {
               mfz.getFahrten().get(fahrtID-1).setMitfahrer(f.getMitfahrer());
           }
       }
       
       if(f.getRoute() != null) {
            if(!mfz.getFahrten().get(fahrtID-1).getRoute().equals(f.getRoute())) {
                if(f.getRoute().getStartpunkt() == null ) {
                    Route r = new Route();
                    r.setStartpunkt(mfz.getFahrten().get(fahrtID-1).getRoute().getStartpunkt());
                    r.setZielpunkt(f.getRoute().getZielpunkt());
                    mfz.getFahrten().get(fahrtID-1).setRoute(r);
                } else if(f.getRoute().getZielpunkt() == null) {
                    Route r = new Route();
                    r.setStartpunkt(f.getRoute().getStartpunkt());
                    r.setZielpunkt(mfz.getFahrten().get(fahrtID-1).getRoute().getZielpunkt());
                    mfz.getFahrten().get(fahrtID-1).setRoute(r);
                } else {
                    mfz.getFahrten().get(fahrtID-1).setRoute(f.getRoute());
                }
                    
            }
       }
       m.marshal(mfz, new FileWriter(OUTPUTFILE));
   }
   
   /**
    * Löscht eine Fahrt aus der XML-Datei.
    * @param fahrtID Die Nummer der Fahrt.
    * @throws JAXBException
    * @throws FileNotFoundException
    * @throws IOException 
    */
   @DELETE
   @Path("fahrten/delete/{fahrtenid}")
   public void deleteFahrt(@PathParam("fahrtenid") int fahrtID) throws JAXBException, FileNotFoundException, IOException {
       unmarshal(INPUTFILE);
       
       Marshaller m = context.createMarshaller();
       m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
       mfz.getFahrten().remove(fahrtID-1);
       m.marshal(mfz, new FileWriter(OUTPUTFILE));
   }
   
   /**
    * Hilfsmethode um Zeilen zu sparen, liest die Daten aus der XML-Datei.
    * @param inputfile Die Datei aus der gelesen werden soll.
    * @throws JAXBException
    * @throws FileNotFoundException 
    */
   private void unmarshal(String inputfile) throws JAXBException, FileNotFoundException {
       context = JAXBContext.newInstance(Mitfahrzentrale.class);
       Unmarshaller um = context.createUnmarshaller();
       mfz = (Mitfahrzentrale) um.unmarshal(new FileReader(inputfile));
   }
}