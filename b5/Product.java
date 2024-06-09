package b5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Product {
    private String productId;
    private String productName;
    private float price;
    private String description;
    private Date created;
    private String catalogName;
    private int productStatus;

    public Product() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        // Nhập mã sản phẩm
        System.out.print("Nhập mã sản phẩm (ví dụ: C123, S456, A789): ");
        String productId;
        while (true) {
            productId = scanner.nextLine();
            if (validateProductId(productId)) {
                this.setProductId(productId);
                break;
            } else {
                System.out.print("Mã sản phẩm không hợp lệ. Vui lòng nhập lại: ");
            }
        }

        // Nhập tên sản phẩm
        System.out.print("Nhập tên sản phẩm (10-50 ký tự): ");
        String productName;
        while (true) {
            productName = scanner.nextLine();
            if (validateProductName(productName)) {
                this.setProductName(productName);
                break;
            } else {
                System.out.print("Tên sản phẩm không hợp lệ. Vui lòng nhập lại: ");
            }
        }

        // Nhập giá sản phẩm
        System.out.print("Nhập giá sản phẩm (lớn hơn 0): ");
        float price;
        while (true) {
            price = scanner.nextFloat();
            if (price > 0) {
                this.setPrice(price);
                break;
            } else {
                System.out.print("Giá sản phẩm không hợp lệ. Vui lòng nhập lại: ");
            }
        }
        scanner.nextLine(); // Đọc bỏ dòng mới

        // Nhập mô tả sản phẩm
        System.out.print("Nhập mô tả sản phẩm: ");
        this.setDescription(scanner.nextLine());

        // Nhập ngày nhập sản phẩm
        System.out.print("Nhập ngày nhập sản phẩm (dd/MM/yyyy): ");
        Date created;
        while (true) {
            String createdStr = scanner.nextLine();
            try {
                created = new SimpleDateFormat("dd/MM/yyyy").parse(createdStr);
                this.setCreated(created);
                break;
            } catch (ParseException e) {
                System.out.print("Ngày nhập sản phẩm không hợp lệ. Vui lòng nhập lại: ");
            }
        }

        // Nhập tên danh mục
        System.out.print("Nhập tên danh mục: ");
        this.setCatalogName(scanner.nextLine());

        // Nhập trạng thái sản phẩm
        System.out.print("Nhập trạng thái sản phẩm (0: Đang bán, 1: Hết hàng, 2: Không bán): ");
        int productStatus;
        while (true) {
            productStatus = scanner.nextInt();
            if (productStatus >= 0 && productStatus <= 2) {
                this.setProductStatus(productStatus);
                break;
            } else {
                System.out.print("Trạng thái sản phẩm không hợp lệ. Vui lòng nhập lại: ");
            }
        }
    }

    private boolean validateProductId(String productId) {
        String regex = "^[CSA][0-9]{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(productId);
        return matcher.matches();
    }

    private boolean validateProductName(String productName) {
        return productName.length() >= 10 && productName.length() <= 50;
    }

    public void displayData() {
    }
}