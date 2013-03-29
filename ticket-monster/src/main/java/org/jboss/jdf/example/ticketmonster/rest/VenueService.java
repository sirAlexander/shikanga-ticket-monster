package org.jboss.jdf.example.ticketmonster.rest;

import javax.ejb.Stateless;
import javax.ws.rs.Path;

import org.jboss.jdf.example.ticketmonster.model.Venue;

/**
 * <p>
 *     A JAX-RS endpoint for handling {@link Venue}s. Inherits the actual
 *     methods from {@link BaseEntityService}.
 * </p>
 */
@Path("/venues")
/**
 * <p>
 *     This is a stateless service, so a single shared instance can be used in this case.
 * </p>
 */
@Stateless
public class VenueService extends BaseEntityService<Venue> {

    public VenueService() {
        super(Venue.class);
    }

}
