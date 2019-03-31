# springbatchdemo
spring batch demo
This project will be using xml files to configure Spring Batch.

What is Spring Batch
Spring Batch is an open-source lightweight and comprehensive batch framework designed to develop batch applications that can process high volume of data.

Spring Batch provides the necessary classes and APIs supporting the following items:

Transaction management
Chunk based processing
Declarative I/O to read and write resources
Start/Stop/Restart
Retry/Skip
Web based administration interface (With Spring Batch Admin)
Spring Batch can execute a sequence of Jobs. A job consists of many steps that can be chained together. There are two types of steps:

READ-PROCESS-WRITE steps : They consist of reading data for a source (Database, File, etc), process that data and finally write it to a resources (Database, File, etc).
Tasklets or Single Task steps: They consis of sigle tasks, for example: deleting temporary files after the execution of the other steps.
Examples of tasks
Here are some examples of use of Spring Batch Tasks and the convenient type to use with each task:

READ-WRITE-PROCESS : Read data from MySQL database, process it and write it to CSV file.
READ-WRITE-PROCESS: Read Data from files in Folder A, process it, and write data to folder B .
TASKLET : Send newsletter to subscribers.
TASKLET : Clean up a folder.

Use case example
In this example, we will use Spring Batch to read data from a MySql database, process it , and finally write it to a CSV file.

For this tutorial, we will be using the following versions :

spring-core : 4.3.10.RELEASE, Spring framework core
spring-batch-core: 3.0.8.RELEASE, Spring Batch core
mysql-connector-java: 5.1.22 : Contains My SQL driver and other utility classes
spring-jdbc: 4.3.10.RELEASE, to support the communication between Spring Batch and MySQL
Maven :  Apache Maven 3.0.5

THE JOB-PRODUCTS.XML FILE
The file declares also all the beans used by the jobs.

product: A reference to the Product Transfer/Value Bean.
itemProcessor: A Reference to class responsible for processing items
jobListener : A Refernece to the class responsible for listening to job processing events.
productItemReader: A reference to the class responsible for reading data from the database.
productFlatFileItemWriter: A reference to the class responsible for writing data to csv files.

THE PRODUCT MAPPER
This class must implement the RowMapper Class and override the rowMap() method. It is responsible for converting a ResultSet row to a Product object.

THE ITEM PROCESSOR
This object processes an item retrieved from the database. It must implement the ItemProcessor interface and override the process() method.

THE JOB LISTENER
This object is responsible for listening to items processing events. It must implement the JobExecutionListener and override the beforeJob() and afterJob() methods.

THE MAIN PROGRAM
This class executes the job. It references the Spring Batch context file (job-products.xml).
