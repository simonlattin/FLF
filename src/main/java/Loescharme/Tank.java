package Loescharme;

public class Tank {

    private Tankart tankart;
    private char[][][] capacity;
    private int availableUnits;
    private int percentageFull;

    public Tank(Tankart tankart){
        this.tankart = tankart;
        switch (tankart) {
            case WASSER -> {
                this.capacity = new char[50][25][10];
                for (int i = 0; i < 50; i++){
                    for (int j = 0; j < 25; j++){
                        for (int k = 0; k < 10; k++){
                            this.capacity[i][j][k] = 'w';
                            this.availableUnits++;
                        }
                    }
                }
            }
            case SCHAUMPULVER -> {
                this.capacity = new char[25][10][10];
                for (int i = 0; i < 25; i++){
                    for (int j = 0; j < 10; j++){
                        for (int k = 0; k < 10; k++){
                            this.capacity[i][j][k] = 's';
                            this.availableUnits++;
                        }
                    }
                }
            }
        }
    }

    public char[][][] getCapacity() {
        return capacity;
    }

    public Tankart getTankart() {
        return tankart;
    }

    public void fill(int amount){
    int i1 = 0;
    int j1 = 0;
    int k1 = 20;
    amount = amount - 1;
    if (this.tankart == Tankart.WASSER) {
        this.availableUnits = 0;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 25; j++) {
                for (int k = 0; k < 10; k++) {
                    if (this.capacity[i][j][k] == 'w') {
                        this.availableUnits++;
                    }
                }
            }
        }

        for (int i = 49; i >= 0; i--) {
            for (int j = 24; j >= 0; j--) {
                for (int k = 9; k >= 0; k--) {
                    if (this.capacity[i][j][k] != 'w') {
                        i1 = i;
                        j1 = j;
                        k1 = k;
                        i = 0;
                        j = 0;
                        k = 0;
                    }
                    if (this.capacity[0][0][0] == 'w') {
                        break;
                    }
                }
            }
        }
        if (amount <= -1) {
            System.out.println("Your cannot fill a negative amount!");
        } else if (amount > 12499) {
            for (int i = 0; i < 50; i++) {
                for (int j = 0; j < 25; j++) {
                    for (int k = 0; k < 10; k++) {
                        this.capacity[i][j][k] = 'w';
                    }
                }
            }
            this.availableUnits = 0;
            for (int i = 0; i < 50; i++) {
                for (int j = 0; j < 25; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (this.capacity[i][j][k] == 'w') {
                            this.availableUnits++;
                        }
                    }
                }
            }
        } else {
            while (amount > 0 && availableUnits != 12500) {
                for (int k = k1; k >= 0; k--) {
                    this.capacity[i1][j1][k] = 'w';
                    amount--;
                }
                for (int j = j1 -1; j >= 0; j--) {
                    for (int k = 9; k >= 0; k--) {
                        this.capacity[i1][j][k] = 'w';
                        amount--;
                    }
                }
                for (int i = i1 - 1; i >= 0; i--) {
                    for (int j = 24; j >= 0; j--) {
                        for (int k = 9; k >= 0; k--) {
                            this.capacity[i1][j][k] = 'w';
                            amount--;
                        }
                    }
                }
            }
            for (int i = 0; i < 50; i++) {
                for (int j = 0; j < 25; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (this.capacity[i][j][k] == 'w') {
                            this.availableUnits++;
                        }
                    }
                }
            }
        }
        this.percentageFull = this.availableUnits / 12500;
    }
        else if (this.tankart == Tankart.SCHAUMPULVER) {
            this.availableUnits = 0;
            for (int i = 0; i < 25; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (this.capacity[i][j][k] == 's') {
                            this.availableUnits++;
                        }
                    }
                }
            }

            for (int i = 24; i >= 0; i--) {
                for (int j = 9; j >= 0; j--) {
                    for (int k = 9; k >= 0; k--) {
                        if (this.capacity[i][j][k] != 's') {
                            i1 = i;
                            j1 = j;
                            k1 = k;
                            i = 0;
                            j = 0;
                            k = 0;
                        }
                        if (this.capacity[0][0][0] == 's') {
                            break;
                        }
                    }
                }
            }
            if (amount <= -1) {
                System.out.println("Your cannot fill a negative amount!");
            } else if (amount > 2500) {
                for (int i = 0; i < 25; i++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 10; k++) {
                            this.capacity[i][j][k] = 's';
                        }
                    }
                }
                this.availableUnits = 0;
                for (int i = 0; i < 25; i++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 10; k++) {
                            if (this.capacity[i][j][k] == 's') {
                                this.availableUnits++;
                            }
                        }
                    }
                }
            } else {
                while (amount > 0 && availableUnits != 2500) {
                    for (int k = k1; k >= 0; k--) {
                        this.capacity[i1][j1][k] = 's';
                        amount--;
                    }
                    for (int j = j1 -1; j >= 0; j--) {
                        for (int k = 9; k >= 0; k--) {
                            this.capacity[i1][j][k] = 's';
                            amount--;
                        }
                    }
                    for (int i = i1 - 1; i >= 0; i--) {
                        for (int j = 9; j >= 0; j--) {
                            for (int k = 9; k >= 0; k--) {
                                this.capacity[i1][j][k] = 's';
                                amount--;
                            }
                        }
                    }
                }
                for (int i = 0; i < 25; i++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 10; k++) {
                            if (this.capacity[i][j][k] == 's') {
                                this.availableUnits++;
                            }
                        }
                    }
                }
            }
            this.percentageFull = this.availableUnits / 2500;
        }
    }

    public void takeOut(int amount) {

        int i1 = 0;
        int j1 = 0;
        int k1 = 20;
        if (this.tankart == Tankart.WASSER) {
            this.availableUnits = 0;
            for (int i = 0; i < 50; i++) {
                for (int j = 0; j < 25; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (this.capacity[i][j][k] == 'w') {
                            this.availableUnits++;
                        }
                    }
                }
            }
            for (int i = 0; i < 50; i++) {
                for (int j = 0; j < 25; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (this.capacity[i][j][k] == 'w') {
                            i1 = i;
                            j1 = j;
                            k1 = k;
                            break;
                        }
                        if (this.capacity[49][24][9] != 'w') {
                            break;
                        }
                    }
                    if (k1 != 20){
                        break;
                    }
                }
                if (k1 != 20){
                    break;
                }
            }
            if (amount <= -1) {
                System.out.println("Your cannot take a negative amount!");
            } else if (amount > 12499) {
                for (int i = 0; i < 50; i++) {
                    for (int j = 0; j < 25; j++) {
                        for (int k = 0; k < 10; k++) {
                            this.capacity[i][j][k] = '-';
                        }
                    }
                }
                this.availableUnits = 0;
                for (int i = 0; i < 50; i++) {
                    for (int j = 0; j < 25; j++) {
                        for (int k = 0; k < 10; k++) {
                            if (this.capacity[i][j][k] == 'w') {
                                this.availableUnits++;
                            }
                        }
                    }
                }
            } else {
                int z = amount;
                while (z > 0 && availableUnits != 0) {
                    for (int k = k1; k < 10; k++) {
                        this.capacity[i1][j1][k] = '-';
                        z--;
                        System.out.println(z);
                    }
                    for (int j = j1 + 1; j < 25; j++) {
                        for (int k = 0; k < 10; k++) {
                            this.capacity[i1][j][k] = '-';
                            z--;
                            System.out.println(z);
                        }
                    }
                    for (int i = i1 + 1; i < 50; i++) {
                        for (int j = 0; j < 25; j++) {
                            for (int k = 0; k < 10; k++) {
                                this.capacity[i1][j][k] = '-';
                                z--;
                                System.out.println(z);
                            }
                        }
                    }
                    this.availableUnits = 0;
                    for (int i = 0; i < 50; i++) {
                        for (int j = 0; j < 25; j++) {
                            for (int k = 0; k < 10; k++) {
                                if (this.capacity[i][j][k] == 'w') {
                                    this.availableUnits++;
                                }
                            }
                        }
                    }
                }
                }

            this.percentageFull = this.availableUnits / 12500;
        } else if (this.tankart == Tankart.SCHAUMPULVER) {
            this.availableUnits = 0;
            for (int i = 0; i < 25; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (this.capacity[i][j][k] == 's') {
                            this.availableUnits++;
                        }
                    }
                }
            }

            for (int i = 24; i >= 0; i--) {
                for (int j = 9; j >= 0; j--) {
                    for (int k = 9; k >= 0; k--) {
                        if (this.capacity[i][j][k] != 's') {
                            i1 = i;
                            j1 = j;
                            k1 = k;
                            i = 0;
                            j = 0;
                            k = 0;
                        }
                        if (this.capacity[0][0][0] == 's') {
                            break;
                        }
                    }
                }
            }
            if (amount <= -1) {
                System.out.println("Your cannot fill a negative amount!");
            } else if (amount > 2500) {
                for (int i = 0; i < 25; i++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 10; k++) {
                            this.capacity[i][j][k] = 's';
                        }
                    }
                }
                this.availableUnits = 0;
                for (int i = 0; i < 25; i++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 10; k++) {
                            if (this.capacity[i][j][k] == 's') {
                                this.availableUnits++;
                            }
                        }
                    }
                }
            } else {
                while (amount > 0 && availableUnits != 2500) {
                    for (int k = k1; k < 10; k++) {
                        this.capacity[i1][j1][k] = 's';
                        amount--;
                    }
                    for (int j = j1 + 1; j < 10; j++) {
                        for (int k = 0; k < 10; k++) {
                            this.capacity[i1][j][k] = 's';
                            amount--;
                        }
                    }
                    for (int i = i1 + 1; i < 25; i++) {
                        for (int j = 0; j < 10; j++) {
                            for (int k = 0; k < 10; k++) {
                                this.capacity[i1][j][k] = 's';
                                amount--;
                            }
                        }
                    }
                }
                for (int i = 0; i < 25; i++) {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 10; k++) {
                            if (this.capacity[i][j][k] == 's') {
                                this.availableUnits++;
                            }
                        }
                    }
                }
            }
            this.percentageFull = this.availableUnits / 2500;
        }
    }

    public int getPercentageFull() {
        return percentageFull;
    }

    public int getAvailableUnits() {
        return availableUnits;
    }
}
