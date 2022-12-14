package ru.itmo.kotiki.Servicel;

public interface Servicel <Entity, Key>{
    void create(Entity entity);
    Entity read(Key key);
    void update(Entity entity);
    void delete(Entity entity);
}
