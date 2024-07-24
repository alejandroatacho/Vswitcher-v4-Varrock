//Hinamizawa's Variables
WorldPoint currentPoint = client.getLocalPlayer().getWorldLocation();
WorldPoint fail_1 = new WorldPoint(3190, 3410, 0); 
WorldPoint fail_2 = new WorldPoint(3190, 3410, 3); //grace position reach but failed to continue (bug fix)
WorldPoint fail_2_save = new WorldPoint(3198, 3397, 3); //grace position reset
WorldPoint fail_3 = new WorldPoint(3220, 3402, 3); //grace position reached but failed to continue (bug fix)
WorldPoint fail_4 = new WorldPoint(3191, 3394, 3); //grace position reached but failed to continue (bug fix)
WorldPoint fail_5 = new WorldPoint(3186, 3395, 3); //grace position reached but failed to continue (bug fix)
WorldPoint save_1 = new WorldPoint(3212, 3415, 0); 
WorldPoint save_2 = new WorldPoint(3213, 3414, 0);
WorldPoint save_3 = new WorldPoint(3215, 3416, 0);
WorldPoint save_4 = new WorldPoint(3214, 3415, 0);
WorldPoint[] points = {save_1, save_2, save_3, save_4};
WorldPoint selectedPoint = points[new Random().nextInt(points.length)];

if (client.getEnergy() >= 2000) {
    v.getWalking().turnRunningOn();
}

private void pickUpGrace(){
 if(v.getGroundItem().findNearestRandomized(10, 10, 11849) != null) {
    v.getGroundItem().take(11849);
    }
}

if (v.getWalking().nearEntity(Entity.DECORATIVE, 14412, 15)) {
    DecorativeObject decorativeObject = (new DecorativeObjectQuery()).idEquals(new int[]{14412}).result(client).nearestTo(client.getLocalPlayer());
    if (decorativeObject != null) {
        WorldPoint decorWorldPoint = WorldPoint.fromLocal(client, decorativeObject.getX(), decorativeObject.getY(), decorativeObject.getPlane());
        int decorSceneX = decorWorldPoint.getX() - client.getBaseX();
        int decorSceneY = decorWorldPoint.getY() - client.getBaseY();
            if (v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {
                v.invoke("Climb", "<col=ffff>Rough wall", 14412, 3, decorSceneX, decorSceneY, false);
            }
    }
} else if (v.getWalking().nearEntity(Entity.GAME, 14413, 8) && v.getWalking().nearX(3219, 1)) {
    GameObject gameObject = v.getGameObject().findNearest(14413);
    if (gameObject != null) {
        int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
        int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
            if (v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {
                v.invoke("Cross", "<col=ffff>Clothes line", 14413, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
    }
} else if (v.getWalking().nearEntity(Entity.GAME, 14414, 10) && v.getWalking().nearY(3414, 1)) {
    GameObject gameObject = v.getGameObject().findNearest(14414);
    if (gameObject != null) {
        int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
        int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
            if (v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {
                v.invoke("Leap", "<col=ffff>Gap", 14414, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
    }
} else if (v.getWalking().nearEntity(Entity.GAME, 14832, 10) && v.getWalking().nearY(3416, 1)) {
    GameObject gameObject = v.getGameObject().findNearest(14832);
        pickUpGrace();
    if (gameObject != null) {
        int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
        int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
        v.getCallbacks().afterTicks(3, () -> {
            if (v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {
                v.invoke("Balance", "<col=ffff>Wall", 14832, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
        });
    }
} else if (v.getWalking().nearEntity(Entity.GAME, 14833, 10) && v.getWalking().nearY(3406, 1)) {
    GameObject gameObject = v.getGameObject().findNearest(14833);
    if (gameObject != null) {
        int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
        int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
            if (v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {
                v.invoke("Leap", "<col=ffff>Gap", 14833, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
    }
} else if (v.getWalking().nearEntity(Entity.GAME, 14834, 16) && v.getWalking().nearX(3193, 1)) {
    GameObject gameObject = v.getGameObject().findNearest(14834);
    pickUpGrace();
    if (gameObject != null) {
        int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
        int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
        v.getCallbacks().afterTicks(3, () -> {
            if (v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {
                v.invoke("Leap", "<col=ffff>Gap", 14834, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
        });
    }
} else if (v.getWalking().nearEntity(Entity.GAME, 14835, 25) && v.getWalking().nearX(3218, 0)) {
    GameObject gameObject = v.getGameObject().findNearest(14835);
    pickUpGrace();
    if (gameObject != null) {
        int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
        int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
        v.getCallbacks().afterTicks(3, () -> {
            if (v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {
                v.invoke("Leap", "<col=ffff>Gap", 14835, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
        });
    }
} else if (v.getWalking().nearEntity(Entity.GAME, 14836, 25) && v.getWalking().nearY(3403, 0)) {
    GameObject gameObject = v.getGameObject().findNearest(14836);
    pickUpGrace();
    if (gameObject != null) {
        int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
        int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
        v.getCallbacks().afterTicks(3, () -> {
            if (v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {
                v.invoke("Hurdle", "<col=ffff>Ledge", 14836, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
        });
    }
} else if (v.getWalking().nearEntity(Entity.GAME, 14841, 14) && v.getWalking().nearY(3410, 1)) {
    GameObject gameObject = v.getGameObject().findNearest(14841);
    if (gameObject != null) {
        int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
        int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
            if (v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {
                v.invoke("Jump-off", "<col=ffff>Edge", 14841, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
    }
}
 else if (currentPoint.equals(fail_1) && v.getLocalPlayer().hasAnimation(-1) && !v.getWalking().isMoving()) {
        v.getWalking().walk(selectedPoint);
    }
     else if (currentPoint.equals(fail_2) || currentPoint.equals(fail_4) || currentPoint.equals(fail_5) && v.getLocalPlayer().hasAnimation(-1) && !v.getWalking().isMoving()) {
        v.getWalking().walk(fail_2_save);
    GameObject gameObject = v.getGameObject().findNearest(14834);
    if (gameObject != null) {
        int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
        int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
        v.getCallbacks().afterTicks(3, () -> {
            if (v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {
                v.invoke("Leap", "<col=ffff>Gap", 14834, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
        });
    }
    }
     else if (currentPoint.equals(fail_3) && v.getLocalPlayer().hasAnimation(-1) && !v.getWalking().isMoving()) {
    GameObject gameObject = v.getGameObject().findNearest(14835);
    if (gameObject != null) {
        int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
        int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
        v.getCallbacks().afterTicks(3, () -> {
            if (v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {
                v.invoke("Leap", "<col=ffff>Gap", 14835, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
        });
    }
}
    
