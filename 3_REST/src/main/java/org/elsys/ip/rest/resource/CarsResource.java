package org.elsys.ip.rest.resource;

import org.elsys.ip.rest.model.Cars;
import org.elsys.ip.rest.service.CarsService;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import java.io.File;
import java.util.List;
import javax.ws.rs.core.MultivaluedMap;

@Path("cars")
public class CarsResource {

  private CarsService carsService = new CarsService();

  @GET
  @Produces("application/json")
  public List<Cars> getCarList(@Context UriInfo info) {
    MultivaluedMap<String, String> params = info.getQueryParameters();
    List<Cars> carsList = carsService.getCarsList(params);
    return carsList;
  }

  @GET
  @Path("/{carsId}")
  @Produces("application/json")
  public Cars getCars(@PathParam("carsId") int id) {
    return carsService.getCarsById(id);
  }

  @GET
  @Path("/download")
  @Produces(MediaType.APPLICATION_OCTET_STREAM)
  public Response downloadCars() {
    File file = new File("/Users/Ivo/Desktop/testCsv2.csv");
    return Response
            .ok(file)
            .header("Content-Disposition", "attachment; filename=" + file.getName())
            .build();
  }

  @POST
  @Consumes("application/json")
  @Produces("application/json")
  public Cars saveCars(Cars cars) {
    return carsService.saveCars(cars);
  }

  @PUT
  @Path("/{id}")
  @Consumes("application/json")
  @Produces("application/json")
  public Cars updateCars(@PathParam("id") Integer id, Cars cars) {
    return carsService.updateCars(id, cars);
  }

  @DELETE
  @Path("/{id}")
  public void deleteCars(@PathParam("id") Integer id) {
    carsService.deleteCars(id);
  }

}