package Extinguisher;


public class Tank {

    private final TankKind tankKind;
    private char[][][] capacity;
    private int availableUnits;
    private int percentageFull;

    public Tank(TankKind tankKind){
        this.tankKind = tankKind;
        switch (tankKind) {
            case WATER -> {
                this.capacity = new char[75][45][30];
                for (int i = 0; i < 75; i++){
                    for (int j = 0; j < 45; j++){
                        for (int k = 0; k < 30; k++){
                            this.capacity[i][j][k] = 'w';
                            this.availableUnits++;
                        }
                    }
                }
            }
            case FOAM -> {
                this.capacity = new char[75][45][10];
                for (int i = 0; i < 75; i++){
                    for (int j = 0; j < 45; j++){
                        for (int k = 0; k < 10; k++){
                            this.capacity[i][j][k] = 's';
                            this.availableUnits++;
                        }
                    }
                }
            }
        }
        this.percentageFull = 100;
    }

    public char[][][] getCapacity() {
        return capacity;
    }

    public TankKind getTankart() {
        return tankKind;
    }

    public void fill(int amount){
        int i1 = 0;
        int j1 = 0;
        int k1 = 40;
        if (this.tankKind == TankKind.WATER) {
            this.availableUnits = 0;
            for (int i = 0; i < 75; i++) {
                for (int j = 0; j < 45; j++) {
                    for (int k = 0; k < 30; k++) {
                        if (this.capacity[i][j][k] == 'w') {
                            this.availableUnits++;
                        }
                    }
                }
            }
            for (int i = 74; i >= 0; i--) {
                for (int j = 44; j >= 0; j--) {
                    for (int k = 29; k >= 0; k--) {
                        if (this.capacity[i][j][k] == '-') {
                            i1 = i;
                            j1 = j;
                            k1 = k;
                            break;
                        }
                        if (this.capacity[0][0][0] != 'w') {
                            break;
                        }
                    }
                    if (k1 != 40){
                        break;
                    }
                }
                if (k1 != 40){
                    break;
                }
            }
            if (amount <= -1) {
                System.out.println("You cannot take a negative amount!");
            } else if (amount > 101249) {
                for (int i = 74; i >= 0; i--) {
                    for (int j = 44; j >= 0; j--) {
                        for (int k = 29; k >= 0; k--) {
                            this.capacity[i][j][k] = '-';
                        }
                    }
                }
                this.availableUnits = 0;
                for (int i = 0; i < 75; i++) {
                    for (int j = 0; j < 45; j++) {
                        for (int k = 0; k < 30; k++) {
                            if (this.capacity[i][j][k] == 'w') {
                                this.availableUnits++;
                            }
                        }
                    }
                }
            } else {
                int z = amount -1;
                while (z > 0 && availableUnits != 0) {
                    for (int k = k1; k >= 0; k--) {
                        if (z < 0){
                            break;
                        }
                        this.capacity[i1][j1][k] = 'w';
                        z--;
                    }
                    for (int j = j1 - 1; j >= 0; j--) {
                        for (int k = 9; k >= 0; k--) {
                            if (z < 0){
                                break;
                            }
                            this.capacity[i1][j][k] = 'w';
                            z--;
                        }
                    }
                    for (int i = i1 - 1; i >= 0; i--) {
                        for (int j = 44; j >= 0; j--) {
                            for (int k = 29; k >= 0; k--) {
                                if (z < 0){
                                    break;
                                }
                                this.capacity[i][j][k] = 'w';
                                z--;
                            }
                        }
                    }
                    this.availableUnits = 0;
                    for (int i = 0; i < 75; i++) {
                        for (int j = 0; j < 45; j++) {
                            for (int k = 0; k < 10; k++) {
                                if (this.capacity[i][j][k] == 'w') {
                                    this.availableUnits++;
                                }
                            }
                        }
                    }
                }
            }

            this.percentageFull = this.availableUnits / 101250;
        } else if (this.tankKind == TankKind.FOAM) {
            this.availableUnits = 0;
            for (int i = 0; i < 75; i++) {
                for (int j = 0; j < 45; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (this.capacity[i][j][k] == 's') {
                            this.availableUnits++;
                        }
                    }
                }
            }

            for (int i = 74; i >= 0; i--) {
                for (int j = 44; j >= 0; j--) {
                    for (int k = 9; k >= 0; k--) {
                        if (this.capacity[i][j][k] == '-') {
                            i1 = i;
                            j1 = j;
                            k1 = k;
                            break;
                        }
                        if (this.capacity[0][0][0] != 's') {
                            break;
                        }
                    }
                    if (k1 != 40){
                        break;
                    }
                }
                if (k1 != 40){
                    break;
                }
            }
            if (amount <= -1) {
                System.out.println("You cannot take a negative amount!");
            } else if (amount > 33749) {
                for (int i = 74; i >= 0; i--) {
                    for (int j = 45; j >= 0; j--) {
                        for (int k = 9; k >= 0; k--) {
                            this.capacity[i][j][k] = '-';
                        }
                    }
                }
                this.availableUnits = 0;
                for (int i = 0; i < 75; i++) {
                    for (int j = 0; j < 45; j++) {
                        for (int k = 0; k < 10; k++) {
                            if (this.capacity[i][j][k] == 's') {
                                this.availableUnits++;
                            }
                        }
                    }
                }
            } else {
                int z = amount -1;
                while (z > 0 && availableUnits != 0) {
                    for (int k = k1; k >= 0; k--) {
                        if (z < 0){
                            break;
                        }
                        this.capacity[i1][j1][k] = 's';
                        z--;
                    }
                    for (int j = j1 - 1; j >= 0; j--) {
                        for (int k = 9; k >= 0; k--) {
                            if (z < 0){
                                break;
                            }
                            this.capacity[i1][j][k] = 's';
                            z--;
                        }
                    }
                    for (int i = i1 - 1; i >= 0; i--) {
                        for (int j = 44; j >= 0; j--) {
                            for (int k = 9; k >= 0; k--) {
                                if (z < 0){
                                    break;
                                }
                                this.capacity[i][j][k] = 's';
                                z--;
                            }
                        }
                    }
                    this.availableUnits = 0;
                    for (int i = 0; i < 75; i++) {
                        for (int j = 0; j < 45; j++) {
                            for (int k = 0; k < 10; k++) {
                                if (this.capacity[i][j][k] == 's') {
                                    this.availableUnits++;
                                }
                            }
                        }
                    }
                }
            }
            this.percentageFull = this.availableUnits / 33750;
        }
    }
    public void takeOut(int amount) {

        int i1 = 0;
        int j1 = 0;
        int k1 = 40;
        if (this.tankKind == TankKind.WATER) {
            this.availableUnits = 0;
            for (int i = 0; i < 75; i++) {
                for (int j = 0; j < 45; j++) {
                    for (int k = 0; k < 30; k++) {
                        if (this.capacity[i][j][k] == 'w') {
                            this.availableUnits++;
                        }
                    }
                }
            }
            for (int i = 0; i < 75; i++) {
                for (int j = 0; j < 45; j++) {
                    for (int k = 0; k < 30; k++) {
                        if (this.capacity[i][j][k] == 'w') {
                            i1 = i;
                            j1 = j;
                            k1 = k;
                            break;
                        }
                        if (this.capacity[74][44][29] != 'w') {
                            break;
                        }
                    }
                    if (k1 != 40){
                        break;
                    }
                }
                if (k1 != 40){
                    break;
                }
            }
            if (amount <= -1) {
                System.out.println("You cannot take a negative amount!");
            } else if (amount > 101249) {
                for (int i = 0; i < 75; i++) {
                    for (int j = 0; j < 45; j++) {
                        for (int k = 0; k < 30; k++) {
                            this.capacity[i][j][k] = '-';
                        }
                    }
                }
                this.availableUnits = 0;
                for (int i = 0; i < 75; i++) {
                    for (int j = 0; j < 45; j++) {
                        for (int k = 0; k < 30; k++) {
                            if (this.capacity[i][j][k] == 'w') {
                                this.availableUnits++;
                            }
                        }
                    }
                }
            } else {
                int z = amount -1;
                while (z > 0 && availableUnits != 0) {
                    for (int k = k1; k < 30; k++) {
                        if (z < 0){
                            break;
                        }
                        this.capacity[i1][j1][k] = '-';
                        z--;
                    }
                    for (int j = j1 + 1; j < 45; j++) {
                        for (int k = 0; k < 30; k++) {
                            if (z < 0){
                                break;
                            }
                            this.capacity[i1][j][k] = '-';
                            z--;
                        }
                    }
                    for (int i = i1 + 1; i < 75; i++) {
                        for (int j = 0; j < 45; j++) {
                            for (int k = 0; k < 30; k++) {
                                if (z < 0){
                                    break;
                                }
                                this.capacity[i][j][k] = '-';
                                z--;
                            }
                        }
                    }
                    this.availableUnits = 0;
                    for (int i = 0; i < 75; i++) {
                        for (int j = 0; j < 45; j++) {
                            for (int k = 0; k < 30; k++) {
                                if (this.capacity[i][j][k] == 'w') {
                                    this.availableUnits++;
                                }
                            }
                        }
                    }
                }
            }

            this.percentageFull = this.availableUnits / 101250;
        } else if (this.tankKind == TankKind.FOAM) {
            this.availableUnits = 0;
            for (int i = 0; i < 75; i++) {
                for (int j = 0; j < 45; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (this.capacity[i][j][k] == 's') {
                            this.availableUnits++;
                        }
                    }
                }
            }

            for (int i = 0; i < 75; i++) {
                for (int j = 0; j < 45; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (this.capacity[i][j][k] == 's') {
                            i1 = i;
                            j1 = j;
                            k1 = k;
                            break;
                        }
                        if (this.capacity[74][44][9] != 's') {
                            break;
                        }
                    }
                    if (k1 != 40){
                        break;
                    }
                }
                if (k1 != 40){
                    break;
                }
            }
            if (amount <= -1) {
                System.out.println("You cannot take a negative amount!");
            } else if (amount > 33749) {
                for (int i = 0; i < 75; i++) {
                    for (int j = 0; j < 45; j++) {
                        for (int k = 0; k < 10; k++) {
                            this.capacity[i][j][k] = '-';
                        }
                    }
                }
                this.availableUnits = 0;
                for (int i = 0; i < 75; i++) {
                    for (int j = 0; j < 45; j++) {
                        for (int k = 0; k < 10; k++) {
                            if (this.capacity[i][j][k] == 's') {
                                this.availableUnits++;
                            }
                        }
                    }
                }
            } else {
                int z = amount -1;
                while (z > 0 && availableUnits != 0) {
                    for (int k = k1; k < 10; k++) {
                        if (z < 0){
                            break;
                        }
                        this.capacity[i1][j1][k] = '-';
                        z--;
                    }
                    for (int j = j1 + 1; j < 45; j++) {
                        for (int k = 0; k < 10; k++) {
                            if (z < 0){
                                break;
                            }
                            this.capacity[i1][j][k] = '-';
                            z--;
                        }
                    }
                    for (int i = i1 + 1; i < 75; i++) {
                        for (int j = 0; j < 45; j++) {
                            for (int k = 0; k < 10; k++) {
                                if (z < 0){
                                    break;
                                }
                                this.capacity[i][j][k] = '-';
                                z--;
                            }
                        }
                    }
                    this.availableUnits = 0;
                    for (int i = 0; i < 75; i++) {
                        for (int j = 0; j < 45; j++) {
                            for (int k = 0; k < 10; k++) {
                                if (this.capacity[i][j][k] == 's') {
                                    this.availableUnits++;
                                }
                            }
                        }
                    }
                }
            }
            this.percentageFull = this.availableUnits / 33570;
        }
    }

    public int getPercentageFull() {
        return percentageFull;
    }

    public int getAvailableUnits() {
        return availableUnits;
    }

    public TankKind getTankKind(){
        return tankKind;
    }
}
