package org.pt3k.material;

import org.pt3k.Ray;
import org.pt3k.Vec3;
import org.pt3k.Wrapper;
import org.pt3k.hit_record;

public class Metal implements Material{

    public Vec3 albedo;

    public Metal(Vec3 albedo) {
        this.albedo = albedo;
    }

    @Override
    public boolean scatter(Ray r_in, hit_record rec, Wrapper wrapper) {
        Vec3 reflected = Vec3.reflect(r_in.getDirection().unit_vector(), rec.normal);
        wrapper.scattered = new Ray(rec.p, reflected);
        wrapper.attenuation = albedo;
        return reflected.dot(rec.normal) > 0;
    }
}