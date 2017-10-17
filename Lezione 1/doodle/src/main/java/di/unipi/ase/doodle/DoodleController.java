package di.unipi.ase.doodle;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class DoodleController {
    //counts the opened doodles
    private int id = 0;
    //keeps track of the currently open doodles as couples <id, Doodle>
    private HashMap<Integer, Doodle> doodles = new HashMap<>();

    // *** [/doodles/] --> PUT + GET ***
    // --- It creates a new Doodle from JSON. ---
    @RequestMapping(value="/doodles", method = RequestMethod.PUT)
    public long createDoodle(@RequestBody Doodle d){
        doodles.put(id, new Doodle(d));
        id++;
        return id - 1;
    }
    // --- It retrieves all currently open Doodles. ---
    @RequestMapping(value="/doodles", method = RequestMethod.GET)
    public HashMap<Integer, Doodle> getDoodles(){
        return doodles;
    }
    // ****************************************

    // *** [/doodles/{id}] --> GET + DELETE ***
    // --- It retrieves the Doodle identified by id ---
    @RequestMapping(value="/doodles/{id}", method = RequestMethod.GET)
    public Doodle getDoodleById(@PathVariable("id") int id){
        return doodles.get(id);
    }

    // --- It deletes the Doodle identified by id ---
    @RequestMapping(value="/doodles/{id}", method = RequestMethod.DELETE)
    public void deleteDoodleById(@PathVariable("id") int id){
        doodles.remove(id);
    }
    // *****************************************

    // *** /doodles/{id}/vote] --> PUT ***
    // --- It creates a new vote in the Doodle identified by id. ---
    // --- It inputs a JSON for the vote and it returns the name of the voter ---
    @RequestMapping(value="/doodles/{id}/vote", method = RequestMethod.PUT)
    public String putVoteById(@PathVariable("id") int id, @RequestBody Vote v){
        String name = doodles.get(id).addVote(v);
        return name;
    }
    // *****************************************

    // *** [/doodles/{id}/vote/{name}] --> GET + POST + DELETE ***
    // --- It returns the option voted by user name in the Doodle identified by id ---
    @RequestMapping(value="/doodles/{id}/vote/{name}", method = RequestMethod.GET)
    public String getOptValueByIdName(@PathVariable("id") int id, @PathVariable("name") String name){
        return doodles.get(id).findPreviousVote(name);
    }

    // --- It posts an update as a new JSON vote to the vote of name in poll id. ---
    // --- It returns the name of the voter. ---
    @RequestMapping(value="/doodles/{id}/vote/{name}", method = RequestMethod.POST)
    public String postVoteByIdName(@PathVariable("id") int id, @RequestBody Vote v){
        doodles.get(id).getVotes().get(v.getOption()).add(v.getName());
        return v.getName();
    }

    // --- It deletes the vote of name from the Doodle identified by id. ---
    @RequestMapping(value="/doodles/{id}/vote/{name}", method = RequestMethod.POST)
    public void DeleteVoteByIdName(@PathVariable("id") int id, @PathVariable("name") String name){
        doodles.get(id).removeVote(name);
    }
    // ***************************************************************
}
