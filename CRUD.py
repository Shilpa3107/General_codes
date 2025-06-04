users={}

def create_user(user_id,name):
    users[user_id] = name

def read_user(user_id):
    return users.get(user_id,"User not found")

def update_user(user_id,new_name):
    if user_id in users:
        users[user_id] = new_name

def delete_user(user_id):
    if user_id in users:
        del users[user_id]

create_user(1,"Amit Kumar")
print(read_user(1))
update_user(1,"Mahesh")
print(read_user(1))
delete_user(1)