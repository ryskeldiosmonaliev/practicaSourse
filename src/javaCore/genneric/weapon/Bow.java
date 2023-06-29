package javaCore.genneric.weapon;

import javaCore.genneric.weapon.RangeWeapon;

public class Bow implements RangeWeapon {
    @Override
    public int getDamage() {
        return 10;
    }
}
