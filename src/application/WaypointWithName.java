package application;

import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;

/**
 * La classe `WaypointWithName` représente un point d'intérêt (waypoint) sur une carte géographique,
 * avec un nom associé.
 * 
 * Elle étend `DefaultWaypoint` pour bénéficier des fonctionnalités de base des waypoints.
 * 
 * @author tom
 * @version 1.0
 */
public class WaypointWithName extends DefaultWaypoint {
    private final String name;

    /**
     * Constructeur de la classe `WaypointWithName`.
     * @author tom
     * @param coord La position géographique (latitude, longitude) du waypoint
     * @param name Le nom associé au waypoint
     */
    public WaypointWithName(GeoPosition coord, String name) {
        super(coord);
        this.name = name;
    }

    /**
     * Obtient le nom associé au waypoint.
     * @author tom
     * @return Le nom du waypoint
     */
    public String getName() {
        return name;
    }
}
