from flask import Flask,jsonify,request
app = Flask(__name__)
jobs = []
job_id_counter = 1

@app.route('/jobs',methods=['POST'])
def add_jobs():
    global job_id_counter
    data = request.json
    data['id'] = job_id_counter
    jobs.append(data)
    job_id_counter +=1
    return jsonify({"message":"Job added successfully"}),201

@app.route('/jobs',methods=['GET'])
def get_jobs():
    return jsonify(jobs),200

@app.route('/jobs/<int:job_id>',methods=["PUT"])
def update_jobs(job_id):
   data = request.json
   for job in jobs:
       if job['id'] == job_id:
         job.update(data)
         return jsonify({"message":"Job updated successfully"}),200
   return jsonify({"message":"Job not found"}),404

@app.route('/jobs/<int:job_id>',methods=['DELETE'])
def delete_job(job_id):
   global jobs
   jobs = [job for job in jobs if job['id'] != job_id]
   return jsonify({"message":"Job is deleted"}),200

if __name__=='__main__':
  app.run(debug=True)