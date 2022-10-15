-	Mã nguồn được code bằng JAVA và sử dụng JUNIT để test.
-	Phần Test gồm 3 file:  
&ensp;BoundaryValueAnalysisTest.java: Kiểm thử giá trị biên  
&ensp;EquivalencePartitioningTest.java: Kiểm thử phân vùng tương đương  
&ensp;CodeFlowTest.java: Kiểm thử dòng điều khiển
-	Để có thể chạy thử Unit Test:  
&ensp;Cách 1: Mở suorce code bằng 1 IDE hỗ trợ như intelij và chạy  
&ensp;Cách 2: Chạy bằng Command Line  
&ensp;&ensp;Để chạy cả 2 file test có thể chạy file run.bat hoặc gõ lệnh:
`gradlew.bat clean test`  
&ensp;&ensp;Để có thể chạy từng file test thì gõ lệnh
`gradlew.bat clean test –tests TênFile`  
(Ví dụ: `gradlew.bat clean test -–tests	BoundaryValueAnalysisTest`)
