package lab4.functional.transport.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Feature {
    private Geometry geometry;
    private FeatureProperties properties;
}