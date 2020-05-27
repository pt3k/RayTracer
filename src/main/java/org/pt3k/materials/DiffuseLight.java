package org.pt3k.materials;

import org.pt3k.Ray;
import org.pt3k.Vec3;
import org.pt3k.Wrapper;
import org.pt3k.hit_record;

public class DiffuseLight implements Material {
    Texture emit;

    public DiffuseLight(Texture a) {
        emit = a;
    }

    @Override
    public boolean scatter(Ray r_in, hit_record rec, Wrapper wrapper) {
        return false;
    }

    @Override
    public Vec3 emitted(float u, float v, Vec3 p) {
        return emit.value(u,v,p);
    }
}
