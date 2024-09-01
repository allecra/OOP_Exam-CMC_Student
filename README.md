ĐỀ THI KẾT THÚC HỌC PHẦN LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG

 Ngành: CNTT, KHMT 
 Đề số: 01
 Trình độ đào tạo: Đại học 
 Thời gian làm bài: 75 phút 
 Số trang đề thi: 02
 
Hướng dẫn: Sinh viên KHÔNG được sử dụng tài liệu. Giám thị coi thi không giải thích gì thêm.

Câu 1:[5 điểm] Lập trình hướng đối tượng (OOP)
Khai báo trong Java IDE (chẳng hạn Netbeans) các lớp kế thừa từ một lớp gốc (trừu tượng) và các 
interface về đối tượng Person, Student, ITStudent, BusinessStudent, LanguageStudent như sau:
- protected String name: Biến name là protected, có thể truy cập từ các lớp con. Nó lưu trữ
tên của người. 
- public abstract String getRole(): Phương thức trừu tượng getRole() được khai báo mà 
không có thân hàm. Lớp con phải ghi đè phương thức này và trả về vai trò cụ thể của đối 
tượng.
- double calculateKPI(): Phương thức trong interface KPIEvaluator định nghĩa chức năng để
tính KPI. Các lớp con phải cung cấp thực thi cho phương thức này.
- public String studentID, int String name, int age, String gender: Các biến public lưu trữ
thông tin cơ bản về sinh viên (nếu đặt là private hoặc protected thì cần cung cấp các hàm 
get, set tương ứng với từng biến).
- public Student(String name, String studentID, int age, String gender): Constructor của lớp 
Student nhận thông tin đầu vào và gọi constructor của lớp cha Person để thiết lập tên.
- public String getRole(): Ghi đè phương thức getRole() để trả về chuỗi "Student".
- public double calculateKPI(): Ghi đè phương thức calculateKPI() để tính KPI dựa trên 
hiệu suất của sinh viên. (Trong ví dụ, trả về một giá trị cố định).
- private String specialization: Biến private lưu trữ thông tin về chuyên ngành của sinh viên.
- Các lớp con gọi constructor của lớp cha Student và cung cấp thông tin về chuyên ngành.
- public String getRole(): Ghi đè phương thức getRole() để trả về vai trò cụ thể của từng 
loại sinh viên.
- Lớp TStudent không cho phép có lớp kế thừa.
Trong hàm main, tạo 1 hoặc 2 đối tượng ITStudent, BusinessStudent, LanguageStudent và 
truyền thông tin vào.
- Sử dụng phương thức toString() để in thông tin chi tiết của từng đối tượng. Sử dụng 
phương thức getRole() và calculateKPI() để in thông tin vai trò và KPI của từng đối 
tượng.

Chú ý: Mã code trên thể hiện sự kết hợp của kế thừa, ghi đè phương thức, và sử dụng các biến 
và phương thức với các mức truy cập khác nhau (private, protected, public) để tạo ra một cây 
phân cấp các lớp liên quan đến sinh viên.

Câu 2: [3 điểm] Lập trình 
Lớp chứa main():
Viết hàm nhập vào 1 số nguyên dương n. Nhập sai thì nhập lại.
Viết hàm nhập vào 1 mảng n đối tượng Student, n là tham số của hàm.

Cách nhập mỗi đối tượng Student như sau:
- nhập khoa của sinh viên thuộc chỉ 1 trong các xâu (không kể chữ hoa/thường) "it","kd","nn" 
tương ứng đối tượng được tạo ra là ITStudent, BusinessStudent, LanguageStudent
- nhập studentID, name, age, gender đúng định dạng biến. Nhập sai thì nhập lại.
- Viết hàm hiển thị mảng đối tượng. Gọi các hàm trên trong hàm main() để nhập và hiển thị
mảng n đối tượng đúng theo từng loại đối tượng ITStudent, BusinessStudent, 
LanguageStudent .

Câu 3: [2 điểm] Giao diện đồ họa
Thiết kế form gồm 1 label, 1 TextFiled ô nhập mã sinh viên, 1 button Tìm kiếm và 1 button Thoát 
và 1 Table gồm 5 cột: Mã sinh viên, Họ tên, Tuổi, Giới tính, Khoa.
+ Đặt form tiêu đề tiếng Việt, size, cỡ và vị trí các điều khiển phù hợp.
+ Đặt tab order phù hợp.
+ Khi form được hiển thì thì TextFiled được focus và rỗng, button tìm kiếm không tương 
tác được.
- Lập trình đổ dữ liệu mảng Student nhập ở Console vào Table khi form được hiển thị. Lập 
trình nắm bắt các sự kiện khi người dùng tương tác các điều khiển:
+ Khi ô mã sinh viên khác rỗng thì button Tìm kiếm sáng (tương tác được), trái lại mờ(không 
tương tác được).
+ Ô mã sinh viên chỉ chi phép nhập kí tự chữ số, nếu nhập sai không nhận.
- Xử lý valid và Tìm kiếm
+ Nhấn Tìm kiếm, khi ô mã sinh viên có text độ dài là khác 9 thì hiển thị hộp thoại thông báo 
"Mã sinh viên không hợp lệ", đóng hộp thoại thì focus lại về ô mã sinh viên.
+ Nhấn Tìm kiếm, khi ô mã sinh viên có text độ dài là 9, tìm dòng của Table có cột mã sinh 
viên trùng với nội dung ô mã sinh viên , nếu không tìm thấy thì hiển thị hộp thoại thông báo 
"Mã sinh viên không tìm thấy", đóng hộp thoại thì focus lại về ô mã sinh viên. Trái lại đặt 
dòng hiện tại của Table có sinh viên với mã được tìm thấy và focus về ô mã sinh viên.
 --------------- HẾT -----------------
