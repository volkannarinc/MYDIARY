package com.mydiary.notes.resource;

import com.mydiary.notes.entity.Shop;
import com.mydiary.notes.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

@Component
@Path("/notes")
public class DiaryResource {

    @Autowired
    private DiaryService diaryService;

    @GET
    @Produces("application/json")
    public List<Shop> getShops() {
        return diaryService.getAll();
    }

    @GET
    @Path("{id}")
    @Produces("application/json")
    public Shop getShopWithID(@PathParam("id") int id) {
        return diaryService.getByID(id);
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Shop addShop(Shop c) {
        diaryService.persistShop(c);
        return c;
    }

    @PUT
    @Path("{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Shop updateShop(Shop c) {
        return diaryService.updateShop(c);
    }

    @DELETE
    @Path("{id}")
    @Produces("application/json")
    public void removeShop(@PathParam("id") int id) {
        diaryService.deleteShop(id);
    }


}
