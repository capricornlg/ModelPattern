package com.primeton.pattern.bridge;

/**
 * Created by Administrator on 16-4-3.
 */
public interface Computer {

    void sale();
}

class Desktop implements Computer {

    @Override
    public void sale() {
        System.out.println("销售台式机");
    }
}

class Laptop implements Computer {

    @Override
    public void sale() {
        System.out.println("销售笔记本");
    }
}

class Pad implements Computer {

    @Override
    public void sale() {
        System.out.println("销售平板电脑");
    }
}

class Delldesktop extends Desktop {

    @Override
    public void sale() {
        System.out.println("销售Dell台式机");
    }
}

class Delllaptop extends Laptop {

    @Override
    public void sale() {
        System.out.println("销售Dell笔记本");
    }
}

class Dellpad extends Pad {

    @Override
    public void sale() {
        System.out.println("销售Dell平板电脑");
    }
}


class Shenzhoudesktop extends Desktop {

    @Override
    public void sale() {
        System.out.println("销售Shenzhou台式机");
    }
}

class Shenzhoulaptop extends Laptop {

    @Override
    public void sale() {
        System.out.println("销售Shenzhou笔记本");
    }
}

class Shenzhoupad extends Pad {

    @Override
    public void sale() {
        System.out.println("销售Shenzhou平板电脑");
    }
}