// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from output.proto

package bcml_converter;


public final class SchemaOutput
{

    public static final class UnspecifiedType
    {
        public static final bcml_converter.SchemaOutput.UnspecifiedType.MessageSchema WRITE =
            new bcml_converter.SchemaOutput.UnspecifiedType.MessageSchema();
        public static final bcml_converter.SchemaOutput.UnspecifiedType.BuilderSchema MERGE =
            new bcml_converter.SchemaOutput.UnspecifiedType.BuilderSchema();
        
        public static class MessageSchema implements com.dyuproject.protostuff.Schema<bcml_converter.Output.UnspecifiedType>
        {
            public void writeTo(com.dyuproject.protostuff.Output output, bcml_converter.Output.UnspecifiedType message) throws java.io.IOException
            {
                if(message.hasBaseObjectType())
                    output.writeString(1, message.getBaseObjectType(), false);
                if(message.hasObject())
                    output.writeByteArray(2, message.getObject().toByteArray(), false);

            }
            public boolean isInitialized(bcml_converter.Output.UnspecifiedType message)
            {
                return message.isInitialized();
            }
            public java.lang.String getFieldName(int number)
            {
                return bcml_converter.SchemaOutput.UnspecifiedType.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return bcml_converter.SchemaOutput.UnspecifiedType.getFieldNumber(name);
            }
            public java.lang.Class<bcml_converter.Output.UnspecifiedType> typeClass()
            {
                return bcml_converter.Output.UnspecifiedType.class;
            }
            public java.lang.String messageName()
            {
                return bcml_converter.Output.UnspecifiedType.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return bcml_converter.Output.UnspecifiedType.class.getName();
            }
            //unused
            public void mergeFrom(com.dyuproject.protostuff.Input input, bcml_converter.Output.UnspecifiedType message) throws java.io.IOException {}
            public bcml_converter.Output.UnspecifiedType newMessage() { return null; }
        }
        public static class BuilderSchema implements com.dyuproject.protostuff.Schema<bcml_converter.Output.UnspecifiedType.Builder>
        {
            public void mergeFrom(com.dyuproject.protostuff.Input input, bcml_converter.Output.UnspecifiedType.Builder builder) throws java.io.IOException
            {
                for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
                {
                    switch(number)
                    {
                        case 0:
                            return;
                        case 1:
                            builder.setBaseObjectType(input.readString());
                            break;
                        case 2:
                            builder.setObject(com.google.protobuf.ByteString.copyFrom(input.readByteArray()));
                            break;
                        default:
                            input.handleUnknownField(number, this);
                    }
                }
            }
            public boolean isInitialized(bcml_converter.Output.UnspecifiedType.Builder builder)
            {
                return builder.isInitialized();
            }
            public bcml_converter.Output.UnspecifiedType.Builder newMessage()
            {
                return bcml_converter.Output.UnspecifiedType.newBuilder();
            }
            public java.lang.String getFieldName(int number)
            {
                return bcml_converter.SchemaOutput.UnspecifiedType.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return bcml_converter.SchemaOutput.UnspecifiedType.getFieldNumber(name);
            }
            public java.lang.Class<bcml_converter.Output.UnspecifiedType.Builder> typeClass()
            {
                return bcml_converter.Output.UnspecifiedType.Builder.class;
            }
            public java.lang.String messageName()
            {
                return bcml_converter.Output.UnspecifiedType.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return bcml_converter.Output.UnspecifiedType.class.getName();
            }
            //unused
            public void writeTo(com.dyuproject.protostuff.Output output, bcml_converter.Output.UnspecifiedType.Builder builder) throws java.io.IOException {}
        }
        public static java.lang.String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "baseObjectType";
                case 2: return "object";
                default: return null;
            }
        }
        public static int getFieldNumber(java.lang.String name)
        {
            java.lang.Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }
        private static final java.util.HashMap<java.lang.String,java.lang.Integer> fieldMap = new java.util.HashMap<java.lang.String,java.lang.Integer>();
        static
        {
            fieldMap.put("baseObjectType", 1);
            fieldMap.put("object", 2);
        }
    }

    public static final class Item
    {
        public static final bcml_converter.SchemaOutput.Item.MessageSchema WRITE =
            new bcml_converter.SchemaOutput.Item.MessageSchema();
        public static final bcml_converter.SchemaOutput.Item.BuilderSchema MERGE =
            new bcml_converter.SchemaOutput.Item.BuilderSchema();
        
        public static class MessageSchema implements com.dyuproject.protostuff.Schema<bcml_converter.Output.Item>
        {
            public void writeTo(com.dyuproject.protostuff.Output output, bcml_converter.Output.Item message) throws java.io.IOException
            {
                if(message.hasTitle())
                    output.writeString(1, message.getTitle(), false);
                if(message.hasNote())
                    output.writeString(2, message.getNote(), false);
                if(message.hasQuantity())
                    output.writeInt64(3, message.getQuantity(), false);
                if(message.hasPrice())
                    output.writeDouble(4, message.getPrice(), false);
            }
            public boolean isInitialized(bcml_converter.Output.Item message)
            {
                return message.isInitialized();
            }
            public java.lang.String getFieldName(int number)
            {
                return bcml_converter.SchemaOutput.Item.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return bcml_converter.SchemaOutput.Item.getFieldNumber(name);
            }
            public java.lang.Class<bcml_converter.Output.Item> typeClass()
            {
                return bcml_converter.Output.Item.class;
            }
            public java.lang.String messageName()
            {
                return bcml_converter.Output.Item.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return bcml_converter.Output.Item.class.getName();
            }
            //unused
            public void mergeFrom(com.dyuproject.protostuff.Input input, bcml_converter.Output.Item message) throws java.io.IOException {}
            public bcml_converter.Output.Item newMessage() { return null; }
        }
        public static class BuilderSchema implements com.dyuproject.protostuff.Schema<bcml_converter.Output.Item.Builder>
        {
            public void mergeFrom(com.dyuproject.protostuff.Input input, bcml_converter.Output.Item.Builder builder) throws java.io.IOException
            {
                for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
                {
                    switch(number)
                    {
                        case 0:
                            return;
                        case 1:
                            builder.setTitle(input.readString());
                            break;
                        case 2:
                            builder.setNote(input.readString());
                            break;
                        case 3:
                            builder.setQuantity(input.readInt64());
                            break;
                        case 4:
                            builder.setPrice(input.readDouble());
                            break;
                        default:
                            input.handleUnknownField(number, this);
                    }
                }
            }
            public boolean isInitialized(bcml_converter.Output.Item.Builder builder)
            {
                return builder.isInitialized();
            }
            public bcml_converter.Output.Item.Builder newMessage()
            {
                return bcml_converter.Output.Item.newBuilder();
            }
            public java.lang.String getFieldName(int number)
            {
                return bcml_converter.SchemaOutput.Item.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return bcml_converter.SchemaOutput.Item.getFieldNumber(name);
            }
            public java.lang.Class<bcml_converter.Output.Item.Builder> typeClass()
            {
                return bcml_converter.Output.Item.Builder.class;
            }
            public java.lang.String messageName()
            {
                return bcml_converter.Output.Item.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return bcml_converter.Output.Item.class.getName();
            }
            //unused
            public void writeTo(com.dyuproject.protostuff.Output output, bcml_converter.Output.Item.Builder builder) throws java.io.IOException {}
        }
        public static java.lang.String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "title";
                case 2: return "note";
                case 3: return "quantity";
                case 4: return "price";
                default: return null;
            }
        }
        public static int getFieldNumber(java.lang.String name)
        {
            java.lang.Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }
        private static final java.util.HashMap<java.lang.String,java.lang.Integer> fieldMap = new java.util.HashMap<java.lang.String,java.lang.Integer>();
        static
        {
            fieldMap.put("title", 1);
            fieldMap.put("note", 2);
            fieldMap.put("quantity", 3);
            fieldMap.put("price", 4);
        }
    }

    public static final class Shipto
    {
        public static final bcml_converter.SchemaOutput.Shipto.MessageSchema WRITE =
            new bcml_converter.SchemaOutput.Shipto.MessageSchema();
        public static final bcml_converter.SchemaOutput.Shipto.BuilderSchema MERGE =
            new bcml_converter.SchemaOutput.Shipto.BuilderSchema();
        
        public static class MessageSchema implements com.dyuproject.protostuff.Schema<bcml_converter.Output.Shipto>
        {
            public void writeTo(com.dyuproject.protostuff.Output output, bcml_converter.Output.Shipto message) throws java.io.IOException
            {
                if(message.hasName())
                    output.writeString(1, message.getName(), false);
                if(message.hasAddress())
                    output.writeString(2, message.getAddress(), false);
                if(message.hasCity())
                    output.writeString(3, message.getCity(), false);
                if(message.hasCountry())
                    output.writeString(4, message.getCountry(), false);
                if(message.hasCar())
                    output.writeEnum(5, message.getCar().getNumber(), false);
            }
            public boolean isInitialized(bcml_converter.Output.Shipto message)
            {
                return message.isInitialized();
            }
            public java.lang.String getFieldName(int number)
            {
                return bcml_converter.SchemaOutput.Shipto.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return bcml_converter.SchemaOutput.Shipto.getFieldNumber(name);
            }
            public java.lang.Class<bcml_converter.Output.Shipto> typeClass()
            {
                return bcml_converter.Output.Shipto.class;
            }
            public java.lang.String messageName()
            {
                return bcml_converter.Output.Shipto.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return bcml_converter.Output.Shipto.class.getName();
            }
            //unused
            public void mergeFrom(com.dyuproject.protostuff.Input input, bcml_converter.Output.Shipto message) throws java.io.IOException {}
            public bcml_converter.Output.Shipto newMessage() { return null; }
        }
        public static class BuilderSchema implements com.dyuproject.protostuff.Schema<bcml_converter.Output.Shipto.Builder>
        {
            public void mergeFrom(com.dyuproject.protostuff.Input input, bcml_converter.Output.Shipto.Builder builder) throws java.io.IOException
            {
                for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
                {
                    switch(number)
                    {
                        case 0:
                            return;
                        case 1:
                            builder.setName(input.readString());
                            break;
                        case 2:
                            builder.setAddress(input.readString());
                            break;
                        case 3:
                            builder.setCity(input.readString());
                            break;
                        case 4:
                            builder.setCountry(input.readString());
                            break;
                        case 5:
                            builder.setCar(bcml_converter.Output.Shipto.CarEnum.valueOf(input.readEnum()));
                            break;
                        default:
                            input.handleUnknownField(number, this);
                    }
                }
            }
            public boolean isInitialized(bcml_converter.Output.Shipto.Builder builder)
            {
                return builder.isInitialized();
            }
            public bcml_converter.Output.Shipto.Builder newMessage()
            {
                return bcml_converter.Output.Shipto.newBuilder();
            }
            public java.lang.String getFieldName(int number)
            {
                return bcml_converter.SchemaOutput.Shipto.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return bcml_converter.SchemaOutput.Shipto.getFieldNumber(name);
            }
            public java.lang.Class<bcml_converter.Output.Shipto.Builder> typeClass()
            {
                return bcml_converter.Output.Shipto.Builder.class;
            }
            public java.lang.String messageName()
            {
                return bcml_converter.Output.Shipto.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return bcml_converter.Output.Shipto.class.getName();
            }
            //unused
            public void writeTo(com.dyuproject.protostuff.Output output, bcml_converter.Output.Shipto.Builder builder) throws java.io.IOException {}
        }
        public static java.lang.String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "name";
                case 2: return "address";
                case 3: return "city";
                case 4: return "country";
                case 5: return "car";
                default: return null;
            }
        }
        public static int getFieldNumber(java.lang.String name)
        {
            java.lang.Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }
        private static final java.util.HashMap<java.lang.String,java.lang.Integer> fieldMap = new java.util.HashMap<java.lang.String,java.lang.Integer>();
        static
        {
            fieldMap.put("name", 1);
            fieldMap.put("address", 2);
            fieldMap.put("city", 3);
            fieldMap.put("country", 4);
            fieldMap.put("car", 5);
        }
    }

    public static final class Shiporder
    {
        public static final bcml_converter.SchemaOutput.Shiporder.MessageSchema WRITE =
            new bcml_converter.SchemaOutput.Shiporder.MessageSchema();
        public static final bcml_converter.SchemaOutput.Shiporder.BuilderSchema MERGE =
            new bcml_converter.SchemaOutput.Shiporder.BuilderSchema();
        
        public static class MessageSchema implements com.dyuproject.protostuff.Schema<bcml_converter.Output.Shiporder>
        {
            public void writeTo(com.dyuproject.protostuff.Output output, bcml_converter.Output.Shiporder message) throws java.io.IOException
            {
                if(message.hasOrderperson())
                    output.writeString(1, message.getOrderperson(), false);
                if(message.hasShipto())
                    output.writeObject(2, message.getShipto(), bcml_converter.SchemaOutput.Shipto.WRITE, false);

                for(bcml_converter.Output.Item item : message.getItemList())
                    output.writeObject(3, item, bcml_converter.SchemaOutput.Item.WRITE, true);

                if(message.hasOrderid())
                    output.writeString(4, message.getOrderid(), false);
            }
            public boolean isInitialized(bcml_converter.Output.Shiporder message)
            {
                return message.isInitialized();
            }
            public java.lang.String getFieldName(int number)
            {
                return bcml_converter.SchemaOutput.Shiporder.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return bcml_converter.SchemaOutput.Shiporder.getFieldNumber(name);
            }
            public java.lang.Class<bcml_converter.Output.Shiporder> typeClass()
            {
                return bcml_converter.Output.Shiporder.class;
            }
            public java.lang.String messageName()
            {
                return bcml_converter.Output.Shiporder.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return bcml_converter.Output.Shiporder.class.getName();
            }
            //unused
            public void mergeFrom(com.dyuproject.protostuff.Input input, bcml_converter.Output.Shiporder message) throws java.io.IOException {}
            public bcml_converter.Output.Shiporder newMessage() { return null; }
        }
        public static class BuilderSchema implements com.dyuproject.protostuff.Schema<bcml_converter.Output.Shiporder.Builder>
        {
            public void mergeFrom(com.dyuproject.protostuff.Input input, bcml_converter.Output.Shiporder.Builder builder) throws java.io.IOException
            {
                for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
                {
                    switch(number)
                    {
                        case 0:
                            return;
                        case 1:
                            builder.setOrderperson(input.readString());
                            break;
                        case 2:
                            builder.setShipto(input.mergeObject(bcml_converter.Output.Shipto.newBuilder(), bcml_converter.SchemaOutput.Shipto.MERGE));

                            break;
                        case 3:
                            builder.addItem(input.mergeObject(bcml_converter.Output.Item.newBuilder(), bcml_converter.SchemaOutput.Item.MERGE));

                            break;
                        case 4:
                            builder.setOrderid(input.readString());
                            break;
                        default:
                            input.handleUnknownField(number, this);
                    }
                }
            }
            public boolean isInitialized(bcml_converter.Output.Shiporder.Builder builder)
            {
                return builder.isInitialized();
            }
            public bcml_converter.Output.Shiporder.Builder newMessage()
            {
                return bcml_converter.Output.Shiporder.newBuilder();
            }
            public java.lang.String getFieldName(int number)
            {
                return bcml_converter.SchemaOutput.Shiporder.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return bcml_converter.SchemaOutput.Shiporder.getFieldNumber(name);
            }
            public java.lang.Class<bcml_converter.Output.Shiporder.Builder> typeClass()
            {
                return bcml_converter.Output.Shiporder.Builder.class;
            }
            public java.lang.String messageName()
            {
                return bcml_converter.Output.Shiporder.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return bcml_converter.Output.Shiporder.class.getName();
            }
            //unused
            public void writeTo(com.dyuproject.protostuff.Output output, bcml_converter.Output.Shiporder.Builder builder) throws java.io.IOException {}
        }
        public static java.lang.String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "orderperson";
                case 2: return "shipto";
                case 3: return "item";
                case 4: return "orderid";
                default: return null;
            }
        }
        public static int getFieldNumber(java.lang.String name)
        {
            java.lang.Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }
        private static final java.util.HashMap<java.lang.String,java.lang.Integer> fieldMap = new java.util.HashMap<java.lang.String,java.lang.Integer>();
        static
        {
            fieldMap.put("orderperson", 1);
            fieldMap.put("shipto", 2);
            fieldMap.put("item", 3);
            fieldMap.put("orderid", 4);
        }
    }

}
