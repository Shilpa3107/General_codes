class JobApplication:
    def __init__(self,applicant_name,applicant_title):
        self.applicant_name = applicant_name
        self.applicant_title = applicant_title
        self.status = "Applied"

    def update_status(self,new_status):
        self.status = new_status

    def display_info(self):
        print(f"Applicant Name : {self.applicant_name}")
        print(f"Applicant Job title : {self.applicant_title}")
        print(f"Job Status : {self.status}")
    
obj = JobApplication("Mahesh Kumar","Data Analyst")
obj.display_info()
obj.update_status("Interview Schedule")
obj.display_info()