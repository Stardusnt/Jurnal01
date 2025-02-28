import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManajerAlatMusik<T> {
    private List<T> daftarAlatMusik = new ArrayList<>();

    public void tambahAlatMusik(T alatMusik) {
        if (alatMusik instanceof AlatMusikTradisional) {
            for (T i : daftarAlatMusik) {
                if (i instanceof AlatMusikTradisional && ((AlatMusikTradisional) i).getKode().equals(((AlatMusikTradisional) alatMusik).getKode())) {
                    System.out.println("Kode sudah ada! Alat musik tidak ditambahkan.");
                    return;
                }
            }
        } else if (alatMusik instanceof AlatMusikElektronik) {
            for (T i : daftarAlatMusik) {
                if (i instanceof AlatMusikElektronik && ((AlatMusikElektronik) i).getKode().equals(((AlatMusikElektronik) alatMusik).getKode())) {
                    System.out.println("Kode sudah ada! Alat musik tidak ditambahkan.");
                    return;
                }
            }
        }
        daftarAlatMusik.add(alatMusik);
    }

    public void hapusAlatMusik(String kode) {
        daftarAlatMusik.removeIf(i -> {
            if (i instanceof AlatMusikTradisional) {
                return ((AlatMusikTradisional) i).getKode().equals(kode);
            } else if (i instanceof AlatMusikElektronik) {
                return ((AlatMusikElektronik) i).getKode().equals(kode);
            }
            return false;
        });
    }

    public void editAlatMusik(String kode, T alatMusikDiperbarui) {
        for (int i = 0; i < daftarAlatMusik.size(); i++) {
            T alatMusik = daftarAlatMusik.get(i);
            if (alatMusik instanceof AlatMusikTradisional && ((AlatMusikTradisional) alatMusik).getKode().equals(kode)) {
                daftarAlatMusik.set(i, alatMusikDiperbarui);
                return;
            } else if (alatMusik instanceof AlatMusikElektronik && ((AlatMusikElektronik) alatMusik).getKode().equals(kode)) {
                daftarAlatMusik.set(i, alatMusikDiperbarui);
                return;
            }
        }
        System.out.println("Alat musik tidak ditemukan!");
    }

    public void tampilkanAlatMusik() {
        Collections.sort(daftarAlatMusik, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                if (o1 instanceof AlatMusikTradisional && o2 instanceof AlatMusikTradisional) {
                    return ((AlatMusikTradisional) o1).getKode().compareTo(((AlatMusikTradisional) o2).getKode());
                } else if (o1 instanceof AlatMusikElektronik && o2 instanceof AlatMusikElektronik) {
                    return ((AlatMusikElektronik) o1).getKode().compareTo(((AlatMusikElektronik) o2).getKode());
                }
                return 0;
            }
        });
        for (T alatMusik : daftarAlatMusik) {
            System.out.println(alatMusik);
        }
    }
}
